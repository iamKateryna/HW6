package interfaces_inheritance_6;

public class Teacher extends Staff {
    private String TYPE_PERSON = "teacher";
    @Override
    public void print() {
        System.out.println("I am a teacher");
    }

    @Override
    public void salary() {
        System.out.println("I make $20 an hour");
    }
}
