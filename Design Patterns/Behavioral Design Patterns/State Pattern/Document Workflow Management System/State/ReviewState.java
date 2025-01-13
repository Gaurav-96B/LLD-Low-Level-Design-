class ReviewState implements DocumentState {
    @Override
    public void edit(Document document) {
        System.out.println("Document is in Review. Only the author can make changes.");
    }

    @Override
    public void review(Document document) {
        System.out.println("Document is already in Review.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Document approved.");
        document.setState(new ApprovedState());
    }

    @Override
    public void publish(Document document) {
        System.out.println("Document in Review cannot be published. Approve it first.");
    }
}
