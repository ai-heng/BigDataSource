package cn.itcast.pojo;

import java.util.Arrays;

public class User {
    private String name;
    private int age;
    private double income;
    private boolean isMarried;
    private String[] interests;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean married) {
        isMarried = married;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", income=" + income +
                ", isMarried=" + isMarried +
                ", interests=" + Arrays.toString(interests) +
                '}';
    }
}
