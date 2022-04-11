package com.company;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/**
 * @see Fraction
 *  */
        Fraction fraction2 = new Fraction("Fraction#2");
        fraction2.person.add(new Deputy("Kondak", "Yuri", 20, true));
        fraction2.person.add(new Deputy("Ivanyan", "Haik", 19, true));
        fraction2.person.add(new Deputy("Kobryn", "Andrian", 23, false));

        Fraction fraction3 = new Fraction("Fraction#3");
        fraction3.person.add(new Deputy("Kondak", "Sofia", 25, true));

        Fraction fraction4 = new Fraction("Fraction#4");
        fraction4.person.add(new Deputy("Kulish", "Bogdan", 22, false));
        fraction4.person.add(new Deputy("Ivahiv", "Nazan", 22, false));

        Fraction fraction5 = new Fraction("Fraction#5");
        fraction5.person.add(new Deputy("Poroshenko", "Petro", 55, false));
        fraction5.person.add(new Deputy("Kobryn", "Kristina", 33, true));

        Fraction fraction6 = new Fraction("Fraction#6");
//      Пуста  фракція

/**
 * @see VerkhovnaRada
 * */
        VerkhovnaRada rada = VerkhovnaRada.getVerkhovnaRada();
        rada.fractions.add(fraction2);
        rada.fractions.add(fraction3);
        rada.fractions.add(fraction4);
        rada.fractions.add(fraction5);
        rada.fractions.add(fraction6);


        while (true) {
            System.out.println("Введіть 1 щоб додати фракцію");
            System.out.println("Введіть 2 щоб видалити конкретну фракцію");
            System.out.println("Введіть 3 щоб вивести усі  фракції");
            System.out.println("Введіть 4 щоб очистити конкретну фракцію");
            System.out.println("Введіть 5 щоб вивести конкретну фракцію");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.next()) {

                case "1": {
                    rada.addFraction(new Fraction("Fraction#7"));
                    VerkhovnaRada.getVerkhovnaRada().outputAllFraction();
                    break;
                }
                case "2": {
                    System.out.println("Введіть фракцію :");
                    scanner = new Scanner(System.in);
                    String name = scanner.next();

                    rada.deleteFraction(rada.fractions, name);
                }
                case "3": {
                    VerkhovnaRada.getVerkhovnaRada().outputAllFraction();
                    break;
                }
                case "4": {
                    System.out.println("Введіть фракцію щоб її очистити:");
                    scanner = new Scanner(System.in);
                    String name = scanner.next();

                    ListIterator<Fraction> fractionListIterator = rada.fractions.listIterator();
                    while (fractionListIterator.hasNext()){
                        Fraction next = fractionListIterator.next();
                        if (next.getFraction().equalsIgnoreCase(name)){
                            next.person.clear();
                            break;
                        }
                    }
                }
                case "5":{
                    System.out.println("Введіть фракцію :");
                    scanner = new Scanner(System.in);
                    String name = scanner.next();

                    rada.outputSpecificFraction(rada.fractions,name);
                }
            }
        }
    }
}


