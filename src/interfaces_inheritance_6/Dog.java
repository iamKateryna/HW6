package interfaces_inheritance_6;

public class Dog implements Animal {
    @Override
    public void voice() {
        System.out.println("woof");
    }

    @Override
    public void feed() {
        System.out.println("i eat pedigree");
    }
}
