package pl.dreem.bridge;

public class Triangle implements Shape {

    int a, h;

    @Override
    public int getArea() {
        return 1/2 * a * h;
    }
}
