package Opereation;

import person.PersonList;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/24
 * @Content:
 */
public class ExitOperation implements IOperation{

    @Override
    public void work(PersonList personList) {
            System.out.println("退出系统");
            System.exit(1);
    }
}
