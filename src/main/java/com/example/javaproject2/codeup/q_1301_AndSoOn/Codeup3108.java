package com.example.javaproject2.codeup.q_1301_AndSoOn;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String code;
    private int testId;
    private String name;

    public Student(String code, int testId, String name) {
        this.code = code;
        this.testId = testId;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getTestId() {
        return testId;
    }

    public String getName() {
        return name;
    }
}

public class Codeup3108 {

    private List<Student> students = new ArrayList<>();

    public Student makeAStudent(String code, int testId, String name) {
        return new Student(code, testId, name);
    }

    private boolean isExist(Student pStudent) {
        for (Student student : students) {
            if (pStudent.getTestId() == student.getTestId()) return true;
        }
        return false;
    }

    private void addAStudent(Student student) {
        if (!isExist(student)) {
            students.add(student);
        }
    }

    private void deleteStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (isExist(students.get(i))) students.remove(i);
        }
    }

    public void process(Student pStudent) {
        switch (pStudent.getCode()) {
            case "I" -> addAStudent(pStudent);
            case "D" -> deleteStudent(pStudent);
        }
    }

    private void printStudents() {
        for (Student student : students) {
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    private void printSpecificStudents(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student student = students.get(arr[i] - 1);
            System.out.printf("%s %s %s\n", student.getCode(), student.getTestId(), student.getName());
        }
    }

    public static void main(String[] args) {
        int size = 1;
        String[] splitted = "I 1011 한라산".split(" ");
        Codeup3108 codeup3108 = new Codeup3108();
        Student student = codeup3108.makeAStudent(splitted[0], Integer.parseInt(splitted[1]), splitted[2]);
        codeup3108.process(student);
        codeup3108.printStudents();
    }
}
