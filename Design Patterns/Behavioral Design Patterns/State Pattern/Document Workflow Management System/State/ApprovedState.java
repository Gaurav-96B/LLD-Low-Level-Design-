class ApprovedState implements DocumentState {
    @Override
    public void edit(Document document) {
        System.out.println("Document is Approved. Editing is not allowed.");
    }

    @Override
    public void review(Document document) {
        System.out.println("Document is Approved. Cannot submit for Review again.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Document is already Approved.");
    }

    @Override
    public void publish(Document document) {
        System.out.println("Publishing the document.");
        document.setState(new PublishedState());
    }
}
