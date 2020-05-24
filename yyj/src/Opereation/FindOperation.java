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
public class FindOperation implements IOperation{

    @Override
    public void work(PersonList personList) {
        System.out.println("查找英雄");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入英雄的名字：");
        String name = scanner.nextLine();
        for(int i = 0; i < personList.getUsedSize(); i++) {
            Person person = personList.getPerson(i);
            if(person.getName().equals(name)){
                System.out.println(person);
                System.out.println("查找成功！");
                return;
            }
        }
        System.out.println("没有你要查的英雄！");
    }
}
