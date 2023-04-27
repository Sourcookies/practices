package com.hspedu.houserent.view;

import com.hspedu.houserent.domain.House;
import com.hspedu.houserent.service.HouseService;

import java.util.Scanner;

public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    Scanner scanner = new Scanner(System.in);
    private HouseService houseService = new HouseService(2);

    //修改房屋信息
    public void update() {
        System.out.println("==========修改房屋信息=========");
        int updateId = scanner.nextInt();
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("=====房屋id信息为空=====");
        }
        System.out.print("姓名(" + house.getName() + "):");
        String name = scanner.next();//如果用户直接回车不修改信息，默认""
        if (!"".equals(name)) {
            house.setName(name);
        }
        System.out.println("修改信息成功");
    }

    //查找房屋信息
    public void findhouse() {
        System.out.println("=======查找房屋信息========");
        System.out.print("输入id：");
        int findId = scanner.nextInt();
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("查找房屋id信息不存在");
        }

    }

    //退出系统
    public void exit() {
        char choice = ' ';
        while (true) {
            System.out.println("=========是否退出(y/n)=========");
             choice = scanner.next().charAt(0);
            if ('y' == choice || 'n' == choice) {
                break;
            }
        }
        if ('y' == choice) {
            loop = false;

        }
    }

    //添加删除方法
    public void delHouse() {
        System.out.println("=========添加房屋信息=======");
        System.out.print("请输入待删除房屋的编号(-1退出)：");
        int delId = scanner.nextInt();
        if (delId == -1) {
            System.out.println("======放弃删除房屋信息=====");
        }
        System.out.println("请输入y/n");
        char choice = scanner.next().charAt(0);
        //真的删除
        if (choice == 'y') {
            if (houseService.del(delId)) {
                System.out.println("===========删除房屋成功============");
            } else {
                System.out.println("===========房屋编号不存在，删除失败================");
            }

        }else{
            System.out.println("======放弃删除房屋信息=====");
        }
    }

    //添加房屋方法
    public void addHouse() {
        System.out.println("=========添加房屋=========");
        System.out.print("姓名：");
        String name = scanner.next();
        System.out.print("电话：");
        String phone = scanner.next();
        System.out.print("地址：");
        String address = scanner.next();
        System.out.print("月租：");
        int rent = scanner.nextInt();
        System.out.print("状态：");
        String state = scanner.next();
        House newHouse = new House(0,name,phone,address,rent,state);
        if (houseService.add(newHouse)) {
            System.out.println("添加房屋成功");
        }else{
            System.out.println("添加房屋失败");
        }
    }

    //编写listHouses()显示房屋列表
    public void listHouses(){
        System.out.println("==========房屋列表==========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();//得到所有房屋信息
        //输出房屋信息
        for (int i = 0; i < houses.length; i++) {
            //数组未满时，剩余数会自动显示为null
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("===========房屋列表显示完毕===========");
    }

    //主菜单
    public void mainMenu() {
        do {
            System.out.println("=============房屋出租系统菜单============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");
            System.out.print("请输入你的选择(1-6):");
            key = scanner.next().charAt(0);
            switch(key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                   findhouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }

        }while(loop);
    }
}
