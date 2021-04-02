package com.java_essential.tsarenko.lesson7.enums.ex004_abstract_methods;

/**
 * Перечисляемые типы (enum).
 */
public enum Company {
    // Экземпляры.
    WEBCAMP(1000) {
        // Можно переопределять методы для отдельных экземпляров.
        @Override
        public int getValue() {
            return 10 + this.value;
        }

        // Абстрактные методы обязятельно должны быть переопределены в экземплярах перечисляемых типов.
        @Override
        public String getCurrency() {
            return "dollars";
        }
    }, GOOGLE(100) {
        // Абстрактные методы обязятельно должны быть переопределены в экземплярах перечисляемых типов.
        @Override
        public String getCurrency() {
            return "cents";
        }
    }, SKYNET(10) {
        // Можно переопределять методы для отдельных экземпляров.
        @Override
        public String toString() {
            return "Company: " + super.toString();
        }

        // Абстрактные методы обязятельно должны быть переопределены в экземплярах перечисляемых типов.
        @Override
        public String getCurrency() {
            return "euros";
        }
    }; //, TEST, TEST2(1000, "string"); // - Error
    int value;

    // Конструктор может быть только private.
    Company(int value) {
        this.value = value;
    }

    // Можно переопределять методы "для всех" экземпляров перечисляемого типа.
    @Override
    public String toString() {
        return "Company: " + super.toString() + ", salary = " + getValue() + " " + getCurrency();
    }

    public int getValue() {
        return value;
    }

    public abstract String getCurrency();
}