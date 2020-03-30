package com.leesin;

/**
 * @description:
 * @author: Leesin.Dong
 * @date: Created in 2020/3/30 7:58
 * @version: ${VERSION}
 * @modified By:
 */
public class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
