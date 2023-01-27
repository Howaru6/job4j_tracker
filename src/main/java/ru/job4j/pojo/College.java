package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Igor Kadochnikov");
        student.setGroup(1);
        student.setDate(new Date());

        System.out.println("Student " + student.getName() + " in group " + student.getGroup() + " completed the task at " + student.getDate());
    }
}
