package 싱글톤패턴실습문제;

public class GameMain {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("=== 초기 설정 확인 ===");
        player1.print();

        System.out.println("=== 플레이어 1이 설정 변경 (해상도: 1920, 음량: 80, 난이도: 3) ===");
        player1.setSettings(1920, 80, 3);
        player1.print();

        System.out.println("=== 플레이어 2의 설정 확인 (동일하게 바뀌었는지 체크) ===");
        player2.print();

    }
}
