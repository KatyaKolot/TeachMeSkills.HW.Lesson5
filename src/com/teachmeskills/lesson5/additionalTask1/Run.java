package com.teachmeskills.lesson5.additionalTask1;

public class Run {
    public static void main(String[] args) {
    Computer Computer1 = new Computer(1000,"MacBookP309,1");
    Computer Computer2 = new Computer(1000,"MacBookP309,1","DDR 1.25","Data");
    RAM data1 = new RAM("DDR", 1.25);
    HDD data2 = new HDD("Data", 58, "Internal");

    System.out.println("Cost:" + Computer1.Cost);
    System.out.println("Model:" + Computer1.Model);
    System.out.println("RAM:" + Computer1.RAM);
    System.out.println("HDD:" + Computer1.HDD);
    System.out.println();

    System.out.println("Cost:" + Computer2.Cost);
    System.out.println("Model:" + Computer2.Model);
    System.out.println("RAM:" + Computer2.RAM);
    System.out.println("HDD:" + Computer2.HDD);

    }

}
