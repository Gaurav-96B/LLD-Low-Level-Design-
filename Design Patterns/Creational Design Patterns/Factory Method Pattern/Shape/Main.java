interface Shape{
    public void draw();
}

class Circle implements Shape{
    public void draw(){
        System.out.println("drawing circle");
    }
}

class Square implements Shape{
    public void draw(){
        System.out.println("drawing square");
    }
}

class Rectangle implements Shape{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class ShapeFactory{
    public static Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
class Main {
    public static void main(String[] args){
       Shape shape=ShapeFactory.getShape("CIRCLE");
       shape.draw();
       
       Shape shape1=ShapeFactory.getShape("SQUARE");
       shape1.draw();
       
       Shape shape2=ShapeFactory.getShape("RECTANGLE");
       shape2.draw();
    }
}
