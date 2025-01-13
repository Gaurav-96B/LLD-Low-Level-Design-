class DraftState implements DocumentState {
    @Override
    public void edit(Document document) {
        System.out.println("Document is in Draft. Editing is allowed.");
    }

    @Override
    public void review(Document document) {
        System.out.println("Submitting the document for Review.");
        document.setState(new ReviewState());
    }

    @Override
    public void approve(Document document) {
        System.out.println("Document in Draft cannot be approved. Submit it for review first.");
    }

    @Override
    public void publish(Document document) {
        System.out.println("Document in Draft cannot be published. Submit it for review first.");
    }
}
