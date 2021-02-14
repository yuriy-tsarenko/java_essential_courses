package com.java_essential.lesson_1;

public class Computer {
    public static void main(String[] args) {
        Computer []computers =new Computer[5];
        computers [0] = new Computer("Comp1");
        computers [1] = new Computer("Comp2");
        computers [2] = new Computer("Comp3");
        computers [3] = new Computer("Comp4");
        computers [4] = new Computer("Comp5");
for (int i=0,j=computers.length-1;i<= computers.length-1;i++,j--)
{
    System.out.println("OLD "+i+": "+computers[i].getModel());
    computers[i]=computers[j];
    System.out.println("NEW "+i+": "+computers[i].getModel());
}

    }
    private String model;
    public  Computer(String model)
    {
        this.model=model;
    }
    public void  setModel(String model)
    {
        this.model=model;
    }
    public String getModel()
    {
        return model;
    }

}
