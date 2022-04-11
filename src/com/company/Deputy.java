package com.company;

import java.util.Random;

/**
 * @see Person
 *  */
public class Deputy extends Person implements Comparable<Deputy> {
        private String surname;
        private String name;
        private int age;
        private boolean bribe;
        private int sizeOfBride;

    public Deputy(String surname, String name, int age, boolean bribe) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.bribe = bribe;
        habar(bribe);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public boolean isBribe() {
        return bribe;
    }

    public void setBribe(boolean bribe) {
        this.bribe = bribe;
    }

    public int getSizeOfBride() {
        return sizeOfBride;
    }

    public void setSizeOfBride(int sizeOfBride) {
        this.sizeOfBride = sizeOfBride;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", bribe=" + bribe +
                ", sizeOfBride=" + sizeOfBride +
                '}';
    }

    public void giveBride(){
        if (bribe == false){
            System.out.println("Цей депутат не бере хабарів");
        }
        else {
            if (sizeOfBride >= 5000){
                System.out.println("Поліція увязнить депутата");
            }
            else {
                System.out.println("Сума менше 5000");
            }
        }
    }

    public void habar(boolean bribe){
        if (bribe){
            this.sizeOfBride = getRandomValue(1000,10000);
        }
    }

    public static int getRandomValue(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    @Override
    public int compareTo(Deputy o) {
        return (-1)*(this.sizeOfBride > o.getSizeOfBride() ? 1: -1);
    }

}
