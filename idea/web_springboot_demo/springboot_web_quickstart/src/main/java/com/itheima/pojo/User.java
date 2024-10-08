package com.itheima.pojo;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/31
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */
public class User {
    private String name;
    private int age;

    private Address address;

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address.toString() +
                '}';
    }
}
