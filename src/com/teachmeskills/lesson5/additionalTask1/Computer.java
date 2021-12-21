package com.teachmeskills.lesson5.additionalTask1;

public class Computer {
    int Cost;
    String Model;
    String RAM;
    String HDD;

    public Computer(int cost, String model) {
        Cost = cost;
        Model = model;


    }

    public Computer (int cost, String model, String RAM, String HDD) {
        Cost = cost;
        Model = model;
        this.RAM = RAM;
        this.HDD = HDD;
    }
}
