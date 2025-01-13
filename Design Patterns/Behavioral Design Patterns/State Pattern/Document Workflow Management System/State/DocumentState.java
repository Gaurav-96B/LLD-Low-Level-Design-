interface DocumentState {
    void edit(Document document);
    void review(Document document);
    void approve(Document document);
    void publish(Document document);
}
