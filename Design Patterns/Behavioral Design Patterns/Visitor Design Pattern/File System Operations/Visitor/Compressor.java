class Compressor implements Visitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Compressing text file: " + textFile.getName());
    }

    @Override
    public void visit(ImageFile imageFile) {
        System.out.println("Compressing image file: " + imageFile.getName());
    }
}
