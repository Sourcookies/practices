package bags;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeOOP {
    boolean loop = true;
    Scanner scanner= new Scanner(System.in);
    String key = "";
    String details ="---------------零钱通明细----------------";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";
    public void mainmenu(){
        do {
            System.out.println("========零钱通菜单==========");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退   出");

            System.out.print("请选择(1-4):");
            key = scanner.next();
            String note = "";

            switch(key){
                case "1":
                 this.details();
                    break;
                case "2":
                  this.income();
                    break;
                case "3":
                 this.consume();
                    break;
                case "4":
                 this.exit();
                    break;
                default:
                    System.out.println("选择有误，重新选择");
                    break;
            }

        }while(loop);

    }

    public void details(){
        System.out.println(details);
    }
    public void income(){
        System.out.println("收入金额：");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("收入金额应该大于0");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收入收益\t+" + money + "\t" + sdf.format(date) + "\t余额 " + balance ;}

    public void consume(){
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应在0-" + balance);
            return;
        }
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        date = new Date();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额 " + balance ;
    }
    public void exit() {
        String choice = "";

        while (true) {
            System.out.println("你确定要退出吗：y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        if ("y".equals(choice)) {
            loop = false;
        }

        System.out.println("-------退出了零钱通项目-------");
    }
}
