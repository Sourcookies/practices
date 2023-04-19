package bag;

public class array {
    public static void main(String[] args) {
        person[] person = new person[3];
        person[0] = new person(10,"ja","wu");
        person[1] = new person(50,"jack","wu");
        person[2]  = new person(20,"ze","wu");

        person tmp = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++ ) {
                if (person[j].getAge() < person[j + 1].getAge() ) {
                   tmp = person[j];
                   person[j] = person[j + 1];
                   person[j + 1] = tmp;
                }
            }

        }
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);

        }
    }



}
class person{
    private int age;
    private String name;
    private  String job;

    public person(int age, String name, String job) {
        this.age = age;
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
