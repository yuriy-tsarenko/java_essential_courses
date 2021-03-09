package com.java_essential.varycheva.essential.homework.hw8.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Workers {

    List<Worker> workers = new ArrayList<>();

    public Workers() {
    }

    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    public List<Worker> sortByAlphabet() {
        return this.workers.stream().sorted().collect(Collectors.toList());
    }

    public List<Worker> getWorkersByYear(int year) {
        List<Worker> result = new ArrayList<>();
        workers.forEach(item -> {
            if (item.getYear() > year) {
                result.add(item);
            }
        });
        return result;
    }

    public void printWorkers() {
        sortByAlphabet().forEach(item -> {
            System.out.println(item.toString());
        });
    }

    public void printLastNames(int year) {
        getWorkersByYear(year).forEach(item -> {
            System.out.println("Фамилия сотрудника: " + item.getLastName());
        });
    }
}
