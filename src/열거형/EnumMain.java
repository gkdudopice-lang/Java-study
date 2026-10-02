package 열거형;
// Enum 클래스: 열거 타입은 한정된 상수 집합을 정의할 수 있는 참조 타입

// 이름
// 개발 타입: 모바일, 프론트, 백엔드, 데이터베이스
// 경력: 신입, 경력
// 성별: 남성, 여성
// 주소:

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class EnumMain {
    static Scanner sc = new Scanner(System.in);
    static List<Developer> devList = new ArrayList<>();

    public static void main(String[] args) {
        // Developer developer = new Developer("장원영", DevType.FRONTEND, Career.JUNIOR, Gender.FEMALE, "천안시");

        while (true) {
            System.out.println("========== 개발자 관리 ==========");
            System.out.println("1. 개발자 등록");
            System.out.println("2. 전체 목록 보기");
            System.out.println("3. 이름으로 검색");
            System.out.println("0. 종료");

        }
    }
    static void reqisterDeveloper(){
            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("개발분야 [1]MOBILE [2]FRONTEND [3]BACKEND [4]DBA");
            int type = sc.nextInt();
            DevType devType = null;
            switch (type){
                case 1: devType = DevType.MOBILE; break;
                case 2:devType = DevType.FRONTEND; break;
                case 3:devType = DevType.BACKEND; break;
                case 4:devType = DevType.DBA; break;
                default: System.out.println("개발 분야 선택이 잘못 되었습니다.");
            }
            System.out.print("경력 [1]신입 [2]경력: ");
            int careerType = sc.nextInt();
            if (careerType == 1){
                Career career = Career.JUNIOR;
            } else if (careerType == 2){
                Career career = Career.SENIOR;
            } else {
                System.out.println("경력 선책이 잘못 되었습니다.");
            }
            System.out.print("성별 [1]여성 [2]남성: ");
            int genderType = sc.nextInt();
            if (genderType == 1){
                Gender gender = Gender.FEMALE;
            } else if (genderType == 2){
                Gender gender = Gender.MALE;
            } else {
                System.out.println("성별 선태이 잘못 되었습니다.");
            }
        }
        sc.nextLine();

        System.out.print("주소: ");
        String addr = sc.nextLine():
        devList.add(new Developer(name, devType, career, gender, addr));
    }
}



