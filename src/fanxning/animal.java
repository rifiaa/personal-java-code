package fanxning;

import java.io.Serial;
import java.io.Serializable;

public class animal implements Serializable {
    @Serial
    private static final long serialVersionUID = 7583784921503914411L;
    private String name;
    private int age;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
    
}
