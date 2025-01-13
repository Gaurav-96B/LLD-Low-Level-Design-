class PublishedState implements DocumentState {
    @Override
    public void edit(Document document) {
        System.out.println("Document is Published. Editing is not allowed.");
    }

    @Override
    public void review(Document document) {
        System.out.println("Document is Published. Cannot submit for Review.");
    }

    @Override
    public void approve(Document document) {
        System.out.println("Document is Published. Approval is not needed.");
    }

    @Override
    public void publish(Document document) {
        System.out.println("Document is already Published.");
    }
}
