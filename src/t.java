public class t {
    public static void main(String[] args) {
        Outer02 o = new Outer02();
        o.m1();

    }
        }

//外部类
class Outer02 {

    //IA类
    interface IA {
        public void cry();
    }

    //Father类
    class Father{
        public void test(){}
    }

    //抽象类
    abstract class animal{
     abstract void eat();
        }

        //以下的是内部类，都在m1()方法中
public void m1() {
       //基于抽象类的匿名内部类
      animal animal =   new animal(){
             void eat(){
                 System.out.println("eat");
             }
        };
    //基于接口的匿名内部类
    IA god = new IA() {
        public void cry() {
            System.out.println("cry");
        }
    };
    god.cry();
    //getClass()查询运行类型
    System.out.println(god.getClass());

    //基于类的匿名内部类
    Father father = new Father(){
        public void test(){
            System.out.println("6");
        }
    };
    System.out.println(father.getClass());
    father.test();
  }
}