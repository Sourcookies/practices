package Person;

public class student extends person1{
    private double score;

    public student(int age, String name, double score) {
        super(age, name);
        this.score = score;
    }
    public String  say(){
        return super.say()+" score = " +score;
    }
}
