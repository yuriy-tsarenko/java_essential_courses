package Lesson1GradoboevHomework.task3;
 //Используя IDEA, создайте проект с пакетом. Создать класс Computer,
   //      создать массив объектов Computers размером 5.
     //    Далее руками создать 5 экземпляров этого класса и записать в компьютер (используя loop)
public class Main {
    public static void main(String[] args) {
    Computer[] computer = new Computer[5];
    computer[0] = new Computer();
    computer[1] = new Computer();
    computer[2] = new Computer();
    computer[3] = new Computer();
    computer[4] = new Computer();

        for (int i = 0; i < 5; i++) {
            computer[i].detail = "detail " + i;
        }
        for (Computer comp : computer) {
            System.out.println("detail " + comp.detail);
        }


    }
}
