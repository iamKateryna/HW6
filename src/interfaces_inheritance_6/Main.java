package interfaces_inheritance_6;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Cat();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Dog();
        animals[4] = new Cat();

        for( int i = 0 ; i < animals.length; i++){
            animals[i].feed();
            animals[i].voice();
        }

        Person[] people = new Person[10];

        people[0] = new Teacher();
        people[1] = new Teacher();
        people[2] = new Teacher();
        people[3] = new Cleaner();
        people[4] = new Student();
        people[5] = new Student();
        people[6] = new Student();
        people[7] = new Student();
        people[8] = new Student();
        people[9] = new Student();

        for( int i = 0 ; i < people.length; i++){
           people[i].print();
           System.out.println(people[i].getClass());
            if (i <=3 ) {
                ((Staff) people[i]).salary();
            }


        }


    }
}
