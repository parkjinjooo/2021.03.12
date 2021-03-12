package day0312;
// 6명의 학생을 관리하는 프로그램을 작성하시오

// 단, 입력 부분은 ScannerUtil을 사용하시오(20분)

import util.ScannerUtil;
import java.util.Scanner;

public class GradeBook01 {
    static final int STUDENT_SIZE = 6;
    static final int SUBJECT_SIZE = 3;
    static final int INDEX_KOREAN = 0;
    static final int INDEX_ENGLISH = 1;
    static final int INDEX_MATH = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] id = new int[STUDENT_SIZE];
        String[] name = new String[STUDENT_SIZE];
        int[][] subject = new int[SUBJECT_SIZE][STUDENT_SIZE];
        int index = 0;

        while (true) {
            System.out.println("1.[입력]  2.[출력]  3.[종료]");
            System.out.print("> ");
            int userChoice = scanner.nextInt();

            if (userChoice == 1) {
                if (index < STUDENT_SIZE) {
                    
                    id[index] = ScannerUtil.nextInt(scanner, "번호를 입력하시오");

                    name[index] = ScannerUtil.nextLine(scanner, "이름을 입력하시오");

                    subject[INDEX_KOREAN][index] = ScannerUtil.nextInt(scanner, "국어점수를 입력하시오", 0, 100);

                    subject[INDEX_ENGLISH][index] = ScannerUtil.nextInt(scanner, "영어점수를 입력하시오", 0, 100);

                    subject[INDEX_MATH][index] = ScannerUtil.nextInt(scanner, "수학점수를 입력하시오", 0, 100);

                    index++;

                } else {
                    System.out.println("더 이상 입력할 수 없습니다.");

                }

            } else if (userChoice == 2) {
                if (index > 0) {
                    for (int i = 0; i < index; i++) {
                        System.out.println();
                        System.out.println("======" + name[i] + "학생의 정보========");
                        System.out.printf("번호: %d번 이름:%s \n", id[i], name[i]);
                        System.out.printf("국어: %03d점 영어: %03d점 수학 %03d점\n", subject[INDEX_KOREAN][i],
                                subject[INDEX_ENGLISH][i], subject[INDEX_MATH][i]);

                        int sum = subject[INDEX_KOREAN][i] + subject[INDEX_ENGLISH][i] + subject[INDEX_MATH][i];
                        double average = (double) sum / SUBJECT_SIZE;

                        System.out.printf("총점: %03d점 평균: %06.2f점 \n", sum, average);
                        System.out.println("=================================");
                        System.out.println();

                    }

                } else {
                    System.out.println("정보를 먼저 입력해주세요.");
                }
            } else if (userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }

    }
}
