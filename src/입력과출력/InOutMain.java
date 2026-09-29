package 입력과출력;
import java.util.Scanner;

public class InOutMain { //  자바 클래스 이름은 대문자로 시작해야 함
    public static void main(String[] args) {
        // System.in: 표준 입력 스트림
        // System.out: 표준 츨력 스트림
        // System.err: 표준 오류 스트림, 거의 사용 되지 않음

        // 이름, 주소, 성별, 국어, 영어, 수학 변수를 만들고 값을 대입
        // 총점과 평균 구하기
        // 이름, 주소, 성별, 총점, 평균을 println()과 printf() 출력

//        String name = "이하영";
//        String addr = "충남 천안시";
//        char gender = 'F';
//        int kor = 99;
//        int eng = 98;
//        int mat = 97;
//        double aver = 0.0;
//        int total = 0;
//
//
//        total = (kor + eng + mat);
//        aver = (double) (kor + eng + mat) / 3;
//
//        // println() : 자바의 오버로딩 문법을 사용, 데이터 타입을 자동으로 찾아 줌
//        System.out.println("이름: " + name + ", 주소: " + addr + ", 성별: " + gender);
//        System.out.println("평균 : " + aver);
//        System.out.println("총점 : " + total);
//
//        // printf() : 서식 지정자를 사용해서 출력 하는 반식
//        System.out.printf("Name : %s\n", name);
//        System.out.printf("Address : %s\n", addr);
//        System.out.printf("Gender : %c\n", gender);
//        System.out.printf("Total : %d\n", total);
//        System.out.printf("Average : %.2f\n", aver);
//
//        String names = "곰돌이";
//        int age = 25;
//        String hobby = "코딩, 독서, 운동";
//        String say = "\"안녕하세요, 잘 부탁드립니다!\"";
//
//        System.out.println("================================");
//        System.out.println("         나를 소개합니다!          ");
//        System.out.println("================================");
//        System.out.println("이름: " + names);
//        System.out.println("나이: " + age + "세");
//        System.out.println("취미: " + hobby);
//        System.out.println("한마디: " + say);
//        System.out.println("================================");
//
//        String m1 = "아메리카노"; int c1 = 2; int p1 = 9000;
//        String m2 = "카페라테"; int c2 = 1; int p2 = 5500;
//        String m3 = "치즈케이크"; int c3 = 1; int p3 = 5500;
//        int totals = p1 + p2 + p3;
//
//        System.out.printf("================================\n");
//        System.out.printf("        JAVA CAFE 영수증          \n");
//        System.out.printf("================================\n");
//        System.out.printf("아메리카노           2잔   9000원");
//
//        System.out.printf("%-10s %5d잔 %7d원\n", m1, c1, p1);
//        System.out.printf("%-10s %5d잔 %7d원\n", m2, c2, p2);
//        System.out.printf("%-10s %5d조각 %6d원\n", m3, c3, p3);
//
//        System.out.printf("--------------------------------\n");
//
//        System.out.printf("합 계                 %,d원\n", totals);
//
//        System.out.printf("================================\n");
//        System.out.printf("감사합니다. 또 방문해주세요!\n");

        // 표준입력은 스캐너 객체 사용
        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성

        // 이름, 주소, 성별, 나이, 이메일을 입력 받아 출력하기
        System.out.print("이릅 입력: ");
        String name = sc.nextLine(); // 문자열을 공백 기준으로 입력 받음

        System.out.print("주소 입력: ");
        String addr = sc.nextLine(); // 문자열을 줄바꿈 기준으로 입력 받음

        System.out.print("성별 입력: ");
        char gender = sc.next().charAt(0); // 문자열에서 해당 인덱스의 문자를 추출

        System.out.print("나이 입력: ");
        int age = sc.nextInt(); // 정수입력

        System.out.print("메일 입력: ");
        String email = sc.next(); // 문자열 입력

        // 출력 해보기, 단 성별은 "남성", "여성"으로 출력
        System.out.println("\n========== [회원 정보 출력] ==========");
        System.out.println("이름: " + name);
        System.out.println("주소: " + addr);
        System.out.println("성별: " + (gender == 'M' || gender == 'm' ? "남성" : "여성"));
        System.out.println("나이: " + age);
        System.out.println("메일: " + email);
    }
}
