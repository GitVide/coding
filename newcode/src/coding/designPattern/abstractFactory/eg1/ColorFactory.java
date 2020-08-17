package coding.designPattern.abstractFactory.eg1;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String product) {
        return null;
    }

    @Override
    public Color getColor(String product) {
        if ("red".equals(product)) {
            return new Red();
        }
        if ("blue".equals(product)) {
            return new Blue();
        }
        return null;
    }
}
