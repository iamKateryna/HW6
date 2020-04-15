package interfaces_inheritance_6;

public class Student extends Person {
    private String TYPE_PERSON = "student";
    @Override
    public void print() {
        System.out.println("I am a student");
    }
}
