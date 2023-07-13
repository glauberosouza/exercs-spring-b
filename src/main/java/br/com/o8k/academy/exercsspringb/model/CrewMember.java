package br.com.o8k.academy.exercsspringb.model;

public class CrewMember {
    private String name;
    private int age;

    public CrewMember(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "CrewMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
