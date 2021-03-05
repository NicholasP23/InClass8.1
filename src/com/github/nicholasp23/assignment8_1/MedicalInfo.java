package com.github.nicholasp23.assignment8_1;

public class MedicalInfo {
    private String name;
    private int age;
    private double height, weight;

    public MedicalInfo(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "MedicalInfo -> " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight;
    }
}
