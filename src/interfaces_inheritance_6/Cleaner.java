package interfaces_inheritance_6;

public class Cleaner extends Staff {
    private String TYPE_PERSON = "cleaner";
    @Override
    public void print() {
        System.out.println("I am a cleaner");
    }
    @Override
    public void salary() {
        System.out.println("I make $8 an hour");
    }

}
