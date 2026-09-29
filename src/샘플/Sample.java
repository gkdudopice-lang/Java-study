package 샘플;

 // 단일 행 주석
/* 다중 행 주석
    저자: 정경수
    일자: 2026.9.28
    목적: 샘플 프로그램
 */
public class Sample {   // 자바는 클래스 기반의 언어이므로 반드시 클래스 필요
    public static void main(String[] args) {    // 프로그램의 시작 메서드
        System.out.println("안녕하세요. 자바 프로그램 입니다."); // 자바는 반드시 ;(세미콜론)으로 끝나야 함

        // 자바의 기본 출력: print(), println(), printf()
        System.out.print(7);        // print() 메소드는 줄바꿈을 하지 않음.
        System.out.println(3);      // 정수 출력
        System.out.println(3.14);

    }
}
