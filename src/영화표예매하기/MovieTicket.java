package 영화표예매하기;

import java.util.Scanner;

public class MovieTicket {
    private final int[] seat = new int[10]; // 배열로 좌석 10개 만들기
    private final Scanner sc = new Scanner(System.in); // 키보드 입력을 받기 위한 스캐너
    int price;

    // 생성자를 통해서 가격을 주입 받음
    public MovieTicket(int price){
        this.price = price;
    }

    // 좌석 상태 출력: 1이면 예약 좌석 [v], 0이면 예약 되지 않은 좌석 [ ]
    public void printSeat() {
        for (int e : seat) {
            System.out.print(e == 0 ? "[ ]" : "[v]");
        }
        System.out.println();
    }

    // 좌석 유효 범위 체크 메서드 구현 (분리된 메서드!)
    public boolean isValidSeat(int seatNum) {
        if (seatNum >= 1 && seatNum <= 10) {
            return true;
        } else {
            System.out.println("존재하지 않는 좌석 번호입니다. 1~10 사이로 입력해주세요.");
            return false;
        }
    }

    // 좌석 예매 메서드
    public void selectSeat() {
        printSeat(); // 1. 먼저 현재 좌석 상태를 보여줌

        System.out.print("예약할 좌석 번호 입력 (1~10): ");
        int seatNum = sc.nextInt(); // 2. 사용자에게 좌석 번호를 입력받음

        // 3. 유효 범위 체크 메서드를 통과한 경우에만 실행
        if (isValidSeat(seatNum)) {
            // 배열은 0부터 시작하므로 입력한 번호에서 1을 빼줍니다. (예: 1번 입력 -> index 0)
            if (seat[seatNum - 1] == 0) {
                seat[seatNum - 1] = 1; // 빈 자리(0)라면 예약 완료(1)로 변경!
                printSeat();
                System.out.println("예약이 완료되었습니다.");
            } else {
                System.out.println("이미 예약된 자리입니다. 다른 좌석을 선택해주세요.");
            }
        }
    }

    // 예약 취소 메서드
    public void cancelSeat() {
        printSeat(); // 1. 먼저 현재 좌석 상태를 보여줌

        System.out.print("취소할 좌석 번호 입력 (1~10): ");
        int seatNum = sc.nextInt(); // 2. 사용자에게 좌석 번호를 입력받음

        // 3. 유효 범위 체크 메서드를 통과한 경우에만 실행
        if (isValidSeat(seatNum)) {
            // 배열은 0부터 시작하므로 입력한 번호에서 1을 빼줍니다. (예: 1번 입력 -> index 0)
            if (seat[seatNum - 1] == 1) {
                seat[seatNum - 1] = 0; // 예약된 자리(1)라면 취소(0)로 변경!
                printSeat();
                System.out.println("취소가 완료되었습니다.");
            } else {
                System.out.println("이미 취소된(비어있는) 자리입니다.");
            }
        }
    }

    // 총 판매 금액 반환 메서드 (int 형으로 변환)
    public int totalAmount(){
        int count = 0;
        for(int i = 0; i < seat.length; i++){
            if (seat[i] == 1) {
                count++;
            }
        }
        return count * price;
    }
}