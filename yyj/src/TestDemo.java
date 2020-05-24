import User.*;
import person.PersonList;

import java.util.Scanner;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/24
 * @Content:
 */
public class TestDemo {
    public static User login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = scanner.nextLine();
        return new Admin(name);
    }

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        User user = login();
        while(true){
            int choice = user.menu();
            user.doOperation(personList, choice);

        }
    }
}