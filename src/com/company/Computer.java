package com.company;

public class Computer
{
    CPU cpu;
    RAM ram;
    Drive drive;

    public Computer()
    {
        cpu = new CPU("testowy", 3.0);
        ram = new RAM(5000);
        drive = new Drive(500, "SSD");
    }
    public void printSpecs()
    {
        System.out.println(cpu);
        System.out.println(ram);
        System.out.println(drive);
    }


}

class CPU
{
    String name;
    double frequency;
    public  CPU(String name, double frequency)
    {
        this.frequency = frequency;
        this.name = name;
    }
    @Override
    public String toString()
    {
        return name  + " " + frequency;
    }
}


class RAM
{
    int capacityMB;
    public RAM(int capacityMB)
    {
        this.capacityMB = capacityMB;
    }
    @Override
    public String toString()
    {
        return  capacityMB + "MB";
    }
}

class Drive
{
    int strorageGB;
    String type;
    public Drive(int strorageGB, String type)
    {
        this.type = type;
        this.strorageGB = strorageGB;
    }
    @Override
    public String toString()
    {
        return strorageGB + "GB" + " " + type;
    }
}
