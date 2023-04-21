package com.example.javaproject2.week1.day5;

public class SpaceInvadersMemberVariable {
    int location;

    public void moveLeft() {
        location -= 1;
        System.out.printf("move left, your location is.. : %d\n", location);
    }

    public void moveRight() {
        location += 1;
        System.out.printf("move right, your location is.. : %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveLeft();
    }
}
