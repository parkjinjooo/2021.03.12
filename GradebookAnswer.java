package day0312;

import util.ScannerUtil;
import java.util.Scanner;

public class GradebookAnswer {
    static final int SIZE_SUBJECT = 3;
    static final int SIZE_STUDENT = 6;
    static final int SCORE_MIN = 0;
    static final int SCORE_MAX = 100;
    static final int INDEX_KOREAN = 0;
    static final int INDEX_ENGLISH = 1;
    static final int INDEX_MATH = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idArray = new int[SIZE_STUDENT];

        String[] nameArray = new String[SIZE_STUDENT];

        int[][] scoreArray = new int[SIZE_STUDENT][SIZE_SUBJECT];

        int index = 0;

        while (true) {

            System.out.println();
            System.out.println("1. 입력  2. 출력  3.종료 ");
            System.out.println();

            int userChoice = sc.nextInt();

            if (userChoice == 1) {
                // 입력 코드 구현
                if (index < SIZE_STUDENT) {

                    // 번호 입력
                    idArray[index] = ScannerUtil.nextInt(sc, "번호를 입력해주세요");

                    // 이름 입력
                    nameArray[index] = ScannerUtil.nextLine(sc, "이름을 입력해주세요");

                    // 국어 입력

                    scoreArray[index][INDEX_KOREAN] = ScannerUtil.nextInt(sc, "국어 점수를 입력해주세요", SCORE_MIN, SCORE_MAX);

                    // 영어 입력
                    scoreArray[index][INDEX_ENGLISH] = ScannerUtil.nextInt(sc, "영어 점수를 입력해주세요", SCORE_MIN, SCORE_MAX);

                    // 수학 입력
                    scoreArray[index][INDEX_MATH] = ScannerUtil.nextInt(sc, "수학 점수를 입력해주세요", SCORE_MIN, SCORE_MAX);

                } else {
                    System.out.println("더이상 입력 할 수 없습니다.");
                }

            } else if (userChoice == 2) {
                if (index > 0) {
                    for (int i = 0; i < index; i++) {
                        System.out.println();
                        System.out.printf("번호: %d번 이름:%s \n", idArray[i], nameArray[i]);
                        System.out.printf("국어: %03d점 영어: %03d점 수학 %03d점\n", scoreArray[i][INDEX_KOREAN],
                                scoreArray[i][INDEX_ENGLISH], scoreArray[i][INDEX_MATH]);

                        int sum = scoreArray[i][INDEX_KOREAN] + scoreArray[i][INDEX_ENGLISH]
                                + scoreArray[i][INDEX_MATH];
                        double average = (double) sum / SIZE_SUBJECT;

                        System.out.printf("총점: %03d점 평균: %06.2f점 \n", sum, average);
                        System.out.println("=================================");
                        System.out.println();

                    }

                }else {
                    System.out.println("아직 입력딘 정보가 존재하지 않습니다.");
                }

            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }

        }
        sc.close();
    }

}
