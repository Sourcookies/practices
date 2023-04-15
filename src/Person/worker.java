package Person;

public class worker extends employee{
    public worker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("worker "+getName() + " is working");

    }
    public double getannual(){
        return super.getannual();
    }
}
