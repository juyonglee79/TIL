import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentsAverageList {
    public static void main(String arg[]) {
        boolean run = true;
        int max = 0, average = 0;
        int student = 0;
        List<Integer> score = new ArrayList<>();
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
                        score.add(i, scanner.nextInt());
                    }
                    break;
                case 3:
                    for (int i = 0; i < student; i++) {
                        System.out.println(score.get(i));
                    }
                    break;
                case 4:
                    for (int i = 0; i < student; i++) {
                        average = (score.get(i) + average)/student;
                        max = score.get(0);
                        if (max < score.get(i)) {
                            max = score.get(i);
                        }
                    }
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + average);
                    break;
                default:
                    run = false;
                    break;
            }
        }
        System.out.println("시스템 종료");
    }
}