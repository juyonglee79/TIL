import java.util.List;
import java.util.Scanner;

public class StudentsAverageArray {
    public static void main(String arg[]) {
        boolean run = true;
        int max = 0, average = 0;
        int student = 0;
        int[] score = null;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("==========================================================");
            System.out.println("1.학생 수 | 2.점수 입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("==========================================================");
            System.out.print("선택>");

            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    student = scanner.nextInt();
                    break;
                case 2:
                    for (int i = 0; i < student; i++) {
                        try {
                            score[i] = scanner.nextInt();
                        } catch (NullPointerException e) {
                        }
                    }
                    break;
                case 3:
                    try {
                        for (int i = 0; i < student; i++) {
                            System.out.println(score[i]);
                        }
                    } catch (NullPointerException e) {
                    }
                    break;
                case 4:
                    try {
                        for (int i = 0; i < student; i++) {
                            average = (score[i] + average) / student;
                            max = score[0];
                            if (max < score[i]) {
                                max = score[i];
                            }
                        }
                        System.out.println("최고 점수: " + max);
                        System.out.println("평균 점수: " + average);
                    } catch (NullPointerException e) {
                    }
                    break;
                default:
                    run = false;
                    break;
            }
        }
        System.out.println("시스템 종료");
    }
}