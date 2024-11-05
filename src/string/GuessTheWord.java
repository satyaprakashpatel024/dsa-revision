package string;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GuessTheWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        ArrayList<String> oddLength = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i].length() % 2 == 1) {
                oddLength.add(arr[i]);
            }
        }

        if (oddLength.isEmpty()) {
            System.out.println("Better luck next time");
        } else {
            String res = "";
            for (String word : oddLength) {
                if (word.length() > res.length()) {
                    res = word;
                }
            }
            System.out.println(res);
        }
    }
}
