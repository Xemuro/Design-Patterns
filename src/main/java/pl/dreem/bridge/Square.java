package pl.dreem.bridge;

public class Square implements Shape{

    int a;

    @Override
    public int getArea() {
        return a*a;
    }

}
