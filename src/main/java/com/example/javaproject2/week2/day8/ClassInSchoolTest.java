package com.example.javaproject2.week2.day8;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool = new ClassInSchool();
        classInSchool.no=1;
        classInSchool.teacherName="박박박";
        classInSchool.students=new Student[20];

        System.out.printf("%d반의 담임선생님은 %s 선생님 입니다. 이 반의 학생수는 %d 명 입니다."
                ,classInSchool.no,classInSchool.teacherName, classInSchool.students.length);
    }
}
