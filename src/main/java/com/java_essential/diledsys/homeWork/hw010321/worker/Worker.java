package com.java_essential.diledsys.homeWork.hw010321.worker;

public class Worker implements Comparable<Worker> {
    String fullName;
    String jobTitle;
    String yearJoining;

    public Worker(String fullName, String jobTitle, String yearJoining) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.yearJoining = yearJoining;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getYearJoining() {
        return yearJoining;
    }

    @Override
    public String toString() {
        return
                "ФИО'" + fullName + "\n" +
                "Должность: " + jobTitle + "\n" +
                "дата принятия на работу:" + yearJoining + "\n";
    }

    @Override
    public int compareTo(Worker worker) {
        return fullName.compareTo(worker.fullName);
    }
}

