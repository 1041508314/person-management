package User;

import Opereation.*;

import java.util.Scanner;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/24
 * @Content:
 */
public class Admin extends User {
    public Admin(String name){
        super(name);
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation()

        };
    }

    @Override
    public int menu() {
        System.out.println("===============");
        System.out.println("hello " + this.name + "欢迎来到英雄系统");
        System.out.println("1.查找英雄");
        System.out.println("2.新增英雄");
        System.out.println("3.删除英雄");
        System.out.println("4.显示所有英雄");
        System.out.println("0.退出系统");
        System.out.println("===============");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
