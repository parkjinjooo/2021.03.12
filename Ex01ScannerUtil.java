package day0312;
// ScannerUtil 실험하는 클래스

import java.util.Scanner;
import util.ScannerUtil;

public class Ex01ScannerUtil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 우리가 기존에 nextInt() 이후에 nextLine()을 쓰는 경우
        // 다음과 같은 양식으로 했었다.

        System.out.println("기존 방법");
        System.out.println("나이");
        System.out.print("> ");
        int age = scanner.nextInt();

        System.out.println("이름");
        System.out.print("> ");
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.printf("이름: %s, 나이: %d세\n", name, age);

        // 하지만, ScannerUtil을 사용하면 우리가 다음과 같이 코드가 짧아진다.
        // 단, ScannerUtil도 다른 패키지에 있는 클래스이기 때문에 우리가 import를 해야한다.
        System.out.println();
        System.out.println("스캐너 유틸버전");
        age = ScannerUtil.nextInt(scanner, "나이를 입력해주세요", 1, 100);

        name = ScannerUtil.nextLine(scanner, "이름을 입력해주세요");
        String job = new String(ScannerUtil.nextLine(scanner, "직업을 입력해주세요"));

        System.out.printf("이름: %s, 나이: %d세\n 직업: %s\n", name, age, job);

        scanner.close();
    }
}
