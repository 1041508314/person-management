package Opereation;

import person.Person;
import person.PersonList;

import java.util.Scanner;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/24
 * @Content:
 */
public class AddOperation implements IOperation{

    @Override
    public void work(PersonList personList) {
        System.out.println("新增英雄：");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入英雄的角色编号：");
        String number = scanner.next();
        System.out.println("请输入英雄的角色类型：");
        String persontype = scanner.next();
        System.out.println("请输入英雄的角色名称：");
        String name = scanner.next();
        System.out.println("请输入英雄的攻击力：");
        String aggressivity = scanner.next();
        System.out.println("请输入英雄的防御力：");
        String defense = scanner.next();
        System.out.println("请输入英雄的移动速度：");
        String speed = scanner.next();

        Person person = new Person(number,persontype,name,aggressivity, defense, speed);
        int curSize = personList.getUsedSize();
        personList.setPerson(curSize,person);
        personList.setUsedSize(curSize+1);
        System.out.println("新增成功！");
    }
}
