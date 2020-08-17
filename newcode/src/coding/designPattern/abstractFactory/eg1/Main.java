package coding.designPattern.abstractFactory.eg1;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape square = shapeFactory.getShape("square");
        Color red = colorFactory.getColor("red");
        Color blue = colorFactory.getColor("blue");
        rectangle.draw();
        square.draw();
        red.fill();
        blue.fill();
    }
}
