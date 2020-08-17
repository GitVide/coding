package coding.designPattern.abstractFactory.eg1;

public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("为图形涂上红色");
    }
}
