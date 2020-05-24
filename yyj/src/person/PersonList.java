package person;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/24
 * @Content:
 */
public class PersonList {
    private Person[] person = new Person[1000];
    private int usedSize = 0;

    public PersonList() {
        person[0] = new Person("1", "战士", "瑞文", "69", "33", "340");
        person[1] = new Person("2", "刺客", "雷恩加尔", "73", "34", "345");
        person[2] = new Person("3", "射手", "薇恩", "65", "23", "330");
        person[3] = new Person("4", "战士", "泰达米尔", "74", "33", "345");
        this.usedSize = 4;
    }
    public void setPerson(int pos,Person person){
        this.person[pos] = person;
    }
    public Person getPerson(int pos){
        return this.person[pos];
    }

    public int getUsedSize()
    {
        return usedSize;
    }

    public void setUsedSize(int usedSize)
    {
        this.usedSize = usedSize;
    }
}

