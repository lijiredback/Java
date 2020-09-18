package com.lijiredback.constructor;

public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("我是父类的空参构造方法");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是父类的有参构造方法");
    }

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
}
