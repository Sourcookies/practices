package Person;

public class managet extends employee{
    private double bonus;

    public managet(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void manager(){
        System.out.println("manager " + getName()+ " is managing");
    }
    public double getannual(){
        return super.getannual() + bonus;
    }
}
