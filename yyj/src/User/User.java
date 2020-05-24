package User;

import person.PersonList;
import Opereation.IOperation;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/24
 * @Content:
 */
public abstract class User {
    protected String name;
    protected IOperation[] operations;
    public User(String name){
        this.name = name;
    }

    public abstract int menu();
    public void doOperation(PersonList personList, int choice){
        this.operations[choice].work(personList);
    }
}
