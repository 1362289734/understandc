package 异常.Day05_1;

import java.util.Scanner;

public class ScoreCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score > 100 || score < 0) {
            throw new ScoreException("分数必须在0-100之间");
        }
    }
}

