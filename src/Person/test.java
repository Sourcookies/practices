package Person;

public class test {
    public static void main(String[] args) {
        worker worker = new worker("javk",2000);
        managet milan = new managet("milan", 25000, 233);
        test test = new test();
        test.show(worker);
        test.show(milan);
        test.testwork(worker);
    }
    public void show(employee e){
        System.out.println(e.getannual());
    }
    public void testwork(employee e){
        if(e instanceof worker){
            ((worker) e).work();
        }else if(e instanceof managet){
            ((managet) e).manager();
        }
    }
}
