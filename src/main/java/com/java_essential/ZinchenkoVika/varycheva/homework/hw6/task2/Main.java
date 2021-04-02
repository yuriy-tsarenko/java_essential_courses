package com.java_essential.ZinchenkoVika.varycheva.homework.hw6.task2;

/*
Создайте проект, используя IntelliJ IDEA.
Требуется: Создать класс Distance с полем distance типа double и методом print.
В классе Distance, создайте статический класс Converter с методами,
которые будут конвертировать расстояние в разные единицы измерения
(к примеру, из метров в километры, из километров в мили, и так далее).
 */
public class Main {
    public static void main(String[] args) {
        Distance distance = new Distance(5);
        Distance.Converter.Length fromUnit = Distance.Converter.Length.KILOMETER;
        Distance.Converter.Length toUnit = Distance.Converter.Length.CM;
        new Distance.Converter(fromUnit);
        double fromValue = Distance.Converter.convertToMeter(distance.getDistance());
        new Distance.Converter(toUnit);
        System.out.println(Distance.Converter.convertFromMeter(fromValue));

    }
}
