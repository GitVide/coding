package coding.designPattern.abstractFactory.eg1;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String product) {
        if ("square".equals(product)) {
            return new Square();
        }
        if ("rectangle".equals(product)) {
            return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String product) {
        return null;
    }
}
