package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Fraction {

    public List<Deputy> person = new ArrayList<>();

    private String fraction;

    public Fraction(String fraction) {
        this.fraction = fraction;
    }

    public String getFraction() {
        return fraction;
    }

    public void setFraction(String fraction) {
        this.fraction = fraction;
    }

    //  Додати депутата
    public void addDeputy(List<Deputy> person) {
        ListIterator<Deputy> deputyListIterator = person.listIterator();
        while (deputyListIterator.hasNext()) {
            Deputy next = deputyListIterator.next();
            if (next.getAge() == 23) {
                 deputyListIterator.add(new Deputy("Shable", "Orest", 34, false));
            }
        }
        while (deputyListIterator.hasNext()) {
            Deputy next1 = deputyListIterator.next();
            System.out.println(next1);
        }
    }

    //  Видалити депутата
    public void deleteDeputy(List<Deputy> person, String name) {
        ListIterator<Deputy> deputyListIterator = person.listIterator();
        int i=0;
        while (deputyListIterator.hasNext()){
            Deputy next = deputyListIterator.next();
            if (next.getName().equalsIgnoreCase(name)){
                person.remove(i);
            }
            i++;
        }
    }
    //  Вивести всіх депутатів хабарників
    public void outPutBribe(List<Deputy> person) {
        ListIterator<Deputy> deputyListIterator = person.listIterator();
        while (deputyListIterator.hasNext()) {
            Deputy bribe1 = deputyListIterator.next();
            if (bribe1.isBribe() == true) {
                System.out.println("Видалено хабарника " + bribe1);
                deputyListIterator.remove();
            }
        }
    }
    //  Вивести найбільшого хабарника
    public void outPutBiggestBribe(List<Deputy> person) {
        Collections.sort(person);
        for (Deputy per1 : person) {
            System.out.println(per1);
        }
    }
    //  Вивести всіх депутатів фракції
    public void outPutAllDeputy(List<Deputy> person) {
        ListIterator<Deputy> deputyListIterator = person.listIterator();
        while (deputyListIterator.hasNext()) {
            Deputy name1 = deputyListIterator.next();
            System.out.println(name1);
        }
    }

    // Очистити всю фракцію від депутатів
    public void clearAllFraction(List<Deputy> person) {
        ListIterator<Deputy> deputyListIterator = person.listIterator();
        while (deputyListIterator.hasNext()) {
            Deputy bribe1 = deputyListIterator.next();
            System.out.println("Видалино з фракції всіх людей " + bribe1);
            deputyListIterator.remove();
        }
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "person=" + person +
                ", fraction='" + fraction + '\'' +
                '}';
    }
}

