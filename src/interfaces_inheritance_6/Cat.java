package interfaces_inheritance_6;

public class Cat implements Animal {
    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public void feed() {
        System.out.println("i eat whiskas");
    }
}
