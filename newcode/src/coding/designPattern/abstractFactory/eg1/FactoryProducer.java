package coding.designPattern.abstractFactory.eg1;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if ("shape".equals(factory)) {
            return new ShapeFactory();
        }
        if ("color".equals(factory)) {
            return new ColorFactory();
        }
        return null;
    }
}
