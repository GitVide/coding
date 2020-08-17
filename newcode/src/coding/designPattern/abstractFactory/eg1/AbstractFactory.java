package coding.designPattern.abstractFactory.eg1;

public abstract class AbstractFactory {
    public abstract Shape getShape(String product);
    public abstract Color getColor(String product);
}
