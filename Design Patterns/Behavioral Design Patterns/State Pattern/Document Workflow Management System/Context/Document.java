class Document {
    private DocumentState state;

    public Document() {
        this.state = new DraftState(); // Initial state
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void edit() {
        state.edit(this);
    }

    public void review() {
        state.review(this);
    }

    public void approve() {
        state.approve(this);
    }

    public void publish() {
        state.publish(this);
    }
}
