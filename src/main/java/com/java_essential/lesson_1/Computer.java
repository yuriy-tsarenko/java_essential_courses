package com.java_essential.lesson_1;

public class Computer {
    public Computer() {

    }

    public Computer next(int num)
    {
        switch (num)
        {
            case  0: return new Computer("Comp1");
            case  1: return new Computer("Comp2");
            case  2: return new Computer("Comp3");
            case  3: return new Computer("Comp4");
            case  4: return new Computer("Comp5");
            default:
        }
        return null;
    }
    public static void main(String[] args) {
        Computer []computers =new Computer[5];
        Computer factory= new Computer();
for (int i=0;i<= computers.length-1;i++)
{
computers[i]=factory.next(i);
}
for (Computer com :computers)
{
    System.out.println(com.model);
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