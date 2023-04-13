package Person;

public class person {
    public static void main(String[] args) {
        person1[] person = new person1[5];
        person[0] =new person1(13,"java");
        person[1] = new student(12,"lili",123);
        person[2] = new student(113,"bby",23);
        person[3] = new teacher(1233,"me",100,12344);
        person[4] = new teacher(1212,"wh",123,234344);
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].say());

        }

    }
}
