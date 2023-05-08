package com.example.javaproject2.codeup.q_1301_AndSoOn;

import java.util.Scanner;

public class codeup1671 {
    //    바위=0, 가위=1, 보=2
//    입력에 따라 win, tie, lose를 출력한다.
    public String play(int user, int computer) {
        if (user == computer) {
            return "tie";
        } else if (user == 0 && computer == 1) {
            return "win";
        } else if (user == 1 && computer == 2) {
            return "win";
        } else if (user == 2 && computer == 0) {
            return "win";
        } else return "lose";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user = scanner.nextInt();
        int computer = scanner.nextInt();

        codeup1671 codeup1671 = new codeup1671();
        System.out.println(codeup1671.play(user, computer));
    }
}
