package Opereation;

import person.Person;
import person.PersonList;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/24
 * @Content:
 */
public class DisplayOperation implements IOperation{


    @Override
    public void work(PersonList personList) {
        System.out.println("显示英雄");
        for (int i = 0; i < personList.getUsedSize(); i++) {
            Person person = personList.getPerson(i);
            System.out.println(person);
        }
    }
}
