package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1;

    //构造器
    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "122", "海定区", 200, "未出租");
    }

    //list方法，返回houses
    public House[] list() {
        return houses;
    }
    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
            
        }
        return null;
    }


    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            //要删除的房屋(id),是数组下标为i的元素
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = 0; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        //删除后的房屋变为null
        houses[--houseNums] = null;
        return true;

    }


    public boolean add(House newHouse) {
        //里面目前有一个房屋所以用houseNums，而不是houseNums - 1
        if (houseNums == houses.length) {
            System.out.println("数组已满，不能添加...");
            return false;
        }
        //把newHouse对象添加进去，新增一个房屋
        houses[houseNums++] = newHouse;
        newHouse.setId(++idCounter);//更新id
        return true;
    }
}
