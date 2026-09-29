package 회원정보예제;

import java.util.Scanner;

public class MemberName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 이름
        System.out.print("이름 입력: ");
        String name = sc.nextLine();

        // 2. 나이
        int age = 0; // 여기서 미리 선언
        while (true) {
            System.out.print("나이 입력 (0~199): ");
            age = sc.nextInt(); // 반복문 안에서는 타입(int) 빼고 값만 대입!
            if (age >= 0 && age < 200) {
                break;
            }
            System.out.println("유효하지 않은 나이입니다. 다시 입력하세요.");
        }

        // 3. 성별
        char gender = ' '; // 여기서 미리 선언
        while (true) {
            System.out.print("성별 입력 (M/F): ");
            gender = sc.next().charAt(0); // 반복문 안에서는 타입(char) 빼고 값만 대입!
            if (gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
                break;
            }
            System.out.println("성별을 잘못 입력하셨습니다. 다시 입력하세요.");
        }

        // 4. 직업
        int job = 0; // 여기서 미리 선언
        while (true) {
            System.out.print("직업 입력 (1-학생, 2-회사원, 3-주부, 4-무직): ");
            job = sc.nextInt(); // 반복문 안에서는 타입(int) 빼고 값만 대입!
            if (job >= 1 && job <= 4) {
                break;
            }
            System.out.println("1부터 4 사이의 숫자로 다시 입력하세요.");
        }

        // 직업 번호를 글자로 변환하기
        String jobStr = "";
        switch (job) {
            case 1: jobStr = "학생"; break;
            case 2: jobStr = "회사원"; break;
            case 3: jobStr = "주부"; break;
            case 4: jobStr = "무직"; break;
        }

        // 성별을 '남성' / '여성' 글자로 변환하기
        String genderStr = "";
        if (gender == 'M' || gender == 'm') {
            genderStr = "남성";
        } else {
            genderStr = "여성";
        }

        // 최종 출력 형식
        System.out.println("\n==== 회원 정보 출력 ====");
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age + "세");
        System.out.println("성별 : " + genderStr);
        System.out.println("직업 : " + jobStr);

        sc.close();
    }
}