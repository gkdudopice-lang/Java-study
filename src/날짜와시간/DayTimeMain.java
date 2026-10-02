package 날짜와시간;

// java.time 패키지 사용

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DayTimeMain {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();               // 오늘 날짜
        LocalTime time = LocalTime.now();               // 현재 시간
        LocalDateTime dateTime = LocalDateTime.now();   // 날짜 + 시간
        ZonedDateTime zoned = ZonedDateTime.now();      // 시간대 포함

        System.out.println(date);       // 2025-05-31
        System.out.println(time);       // 22:38:52.421
        System.out.println(dateTime);   // 2025-05-31T22:38:52.421
        System.out.println(zoned);      // 2025-05-31T22:38:52.421+09:00[Asia/Seoul]

        // 패턴 매칭으로 정보 출력하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(formatter.format(dateTime));

        // 다양한 패턴으로 정보 출력하기
        // 2026년 10월 2일
        formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        System.out.println(formatter.format(dateTime));

        // 24시간제로 15시 50분 45초
        formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
        System.out.println(formatter.format(dateTime));

        // 12시간제 + 오전/오후
        formatter = DateTimeFormatter.ofPattern("a hh시 mm분 ss초");
        System.out.println(formatter.format(dateTime));

        // 요일 포함
        formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일");
        System.out.println(formatter.format(dateTime));

        // 밀리초까지
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(formatter.format(dateTime));



    }
}
