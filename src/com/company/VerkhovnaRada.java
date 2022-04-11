package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class VerkhovnaRada implements Comparable<Deputy> {

    public List<Fraction> fractions = new ArrayList<>();

    private static VerkhovnaRada verkhovnaRada = new VerkhovnaRada();

    public static VerkhovnaRada getVerkhovnaRada() {
        return verkhovnaRada;
    }

    //додати фракцію 1варіант
    public void addFraction(List<Fraction> fractions) {
        ListIterator<Fraction> fractionListIterator = fractions.listIterator();
        while (fractionListIterator.hasNext()) {
            Fraction next = fractionListIterator.next();
            this.fractions.add(next);
        }
    }

    //додати фракцію 2варіант
    public void addFraction(Fraction fraction) {
        this.fractions.add(fraction);
    }

    //видалити фракцію
    public void deleteFraction(List<Fraction> fractions, String name) {
        ListIterator<Fraction> fractionListIterator = fractions.listIterator();
        int i = 0;
        while (fractionListIterator.hasNext()) {
            Fraction fraction = fractionListIterator.next();
            if (fraction.getFraction().equalsIgnoreCase(name)) {
                fractions.remove(i);
                break;
            }
            i++;
        }
    }

    //    вивести всі фракції
    public void outputAllFraction() {
        ListIterator<Fraction> fractionListIterator = this.fractions.listIterator();
        while (fractionListIterator.hasNext()) {
            Fraction next = fractionListIterator.next();
            System.out.println(next);
        }
    }

    //    вивести конкретну фракцію
    public void outputSpecificFraction(List<Fraction> fractions, String name) {
        ListIterator<Fraction> fractionListIterator = fractions.listIterator();
        while (fractionListIterator.hasNext()) {
            Fraction fraction = fractionListIterator.next();
            if (fraction.getFraction().equalsIgnoreCase(name)) {
                System.out.println(fraction.person);
                break;
            }
        }
    }

    //додати депутата до конкретної фракції
    public void addDeputySpecificFraction() {
    }

    //видалити депутата(вводимо з консолі)
    public void deleteDeputy(List<Deputy> person, String name) {
        ListIterator<Deputy> deputyListIterator = person.listIterator();
        while (deputyListIterator.hasNext()) {
            Deputy name1 = deputyListIterator.next();
            for (int i = 0; i < person.size(); i++) {
                if (person.get(i).getName() == name) ;
                person.remove(i);
            }
            break;
        }
    }

    //вивести всіх хабарників у фракції
    public void outputAllBribe(List<Deputy> person) {
        ListIterator<Deputy> deputyListIterator = person.listIterator();
        while (deputyListIterator.hasNext()) {
            Deputy bribe1 = deputyListIterator.next();
            if (bribe1.isBribe() == true) {
                System.out.println("Видалено хабарника " + bribe1);
                deputyListIterator.remove();
            }
        }
    }

    //вивести найбільшого хабарника у фракції
    public void outputMostBribe(List<Deputy> person) {
        Collections.sort(person);
        for (Deputy per1 : person) {
            System.out.println(per1);
        }
    }

    //вивести всіх депутатів фракції
    public void outputAllDeputyFraction() {
    }

    @Override
    public int compareTo(Deputy o) {
        return 0;
    }

    @Override
    public String toString() {
        return "VerkhovnaRada{" +
                "fractions=" + fractions +
                '}';
    }
}
