package Person;

public class teacher extends student{
    private  double salary;

    public teacher(int age, String name, double score, double salary) {
        super(age, name, score);
        this.salary = salary;
    }

    public String say(){
        return super.say()+"salary = " + salary;
    }
}
