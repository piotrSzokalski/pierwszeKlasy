package com.company;

import secondPackage.Bird2;

public class Main
{

    public static void main(String[] args)
    {
	    Cat kot = new Cat(new String("mruczek"), 5, 4.3);
	    kot.printName();
	    Cat kot2 = new Cat("mialczak", 6, 3.1);
        kot2.printName();


        Cat.printNumOfCats();

        System.out.println();
        System.out.println();
        System.out.println();

        Animal[] animals = new Animal[4];
        animals[0] = new Dog();
        animals[1] = new Duck();
        animals[2] = new Dog();
        animals[3] = new Duck();

        for(int i = 0; i < 4;i++)
        {
            animals[i].makeSound();
        }


        System.out.println();
        System.out.println();
        System.out.println();

        Computer komputer = new Computer();
        komputer.printSpecs();


        System.out.println();
        System.out.println();
        System.out.println();


        Bird2 ptok = new Bird2();
        ptok.printName();



        System.out.println("jakis tam text");
    }
}

class Cat
{
    String name;
    int age;
    double weiht;

    static private int numOfCats = 0;

    public Cat(String name, int age, double weight)
    {
        //name = new String(name);
        this.name = name;
        this.age = age;
        this.weiht = weight;
        numOfCats++;
    }
    public String getName()
    {
        return  name;
    }
    public void printName()
    {
        System.out.println("imie kota: " + name);
    }
    static public void printNumOfCats()
    {
        System.out.println("ilosc kotopw w programie: " + numOfCats);
    }
}

abstract class Animal
{
    String speciesName;
    String name;
    private static int numOfAnimals = 0;
    public void printNameOfAnimal()
    {
        System.out.println(name);
    }
    public void makeSound()
    {
        System.out.println("nieznany dzwiek");
    }
}

class Dog extends Animal
{
    public void makeSound()
    {
        System.out.println("Hal hal hal");
    }

}

class Duck extends Animal
{
    public void makeSound()
    {
        System.out.println("kla kla kla");
    }
}

