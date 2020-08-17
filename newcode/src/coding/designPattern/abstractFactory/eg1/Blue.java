package coding.designPattern.abstractFactory.eg1;

public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("为图形涂上蓝色");
    }
}
