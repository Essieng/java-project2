package com.example.javaproject2.week4.day15;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User user1 = new User("김미미","010-1111-1111",14);
        users.add(user1);

        User user2 = new User("김나나", "010-2222-2222", 37);
        users.add(user2);

        System.out.printf("%s는 성인입니까? %s\n", user1.getName(), user1.isAdult());
        System.out.printf("%s는 성인입니까? %s\n", user2.getName(), user2.isAdult());
    }
}
