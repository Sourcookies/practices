package Person;

public class person1 {
    private int age;
    private String name;

    public person1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String say(){
        return "name = "+name + "\t" + "age = "+age;
    }
}