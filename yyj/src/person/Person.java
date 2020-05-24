package person;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/24
 * @Content:
 */
public class Person {
    private String number;
    private String persontype;
    private String name;
    private String aggressivity;
    private String defense;
    private String speed;


    public Person(String number, String persontype, String name,
                  String aggressivity, String defense, String speed) {
        this.number = number;
        this.persontype = persontype;
        this.name = name;
        this.aggressivity = aggressivity;
        this.defense = defense;
        this.speed = speed;

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPersontype() {
        return persontype;
    }

    public void setPersontype(String persontype) {
        this.persontype = persontype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAggressivity() {
        return aggressivity;
    }

    public void setAggressivity(String aggressivity) {
        this.aggressivity = aggressivity;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }


    @Override
    public String toString() {
        return "Person{" +
                "number=" + number +
                ", persontype='" + persontype + '\'' +
                ", name='" + name + '\'' +
                ", aggressivity='" + aggressivity + '\'' +
                ", defense='" + defense + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}
