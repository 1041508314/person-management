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
public class DelOperation implements IOperation{
    @Override
    public void work(PersonList personList) {
        System.out.println("删除英雄");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除英雄的名字：");
        String name = scanner.nextLine();
        int i = 0;
        for (; i < personList.getUsedSize(); i++) {
            Person person = personList.getPerson(i);
            if(person.getName().equals(name)){
                break;
            }
        }
        if(i == personList.getUsedSize()){
            System.out.println("没有这本书！");
            return;
        }
        for (int pos = i; pos < personList.getUsedSize()-1 ; pos++) {
            Person person = personList.getPerson(pos+1);
            personList.setPerson(pos,person);
        }
        personList.setUsedSize(personList.getUsedSize()-1);
    }
}

