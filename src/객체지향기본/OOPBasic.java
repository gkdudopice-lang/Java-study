package 객체지향기본;

public class OOPBasic {
    public static void main(String[] args) {

        // 매개변수가 있는 생성자로 TV를 만들고 동작 해보기
        Television tv1 = new Television(true, 500, 30, "Samsung");
        tv1.setPower(true);
        tv1.setChannel(100, true);
        tv1.setVolume(50);
        tv1.printTV();

        // 매개변수가 없는 생성자로 TV를 만들고 동작 해보기 (브랜드 설정이 안되므로 브랜드 설정에 대한 세터 메서드 구현 필요)
        Television tv2 = new Television();
        tv2.setBrand("SAMSUNG");
        tv2.setPower(true);
        tv2.setChannel(100);
        tv2.setVolume(50);
        tv2.printTV();
    }
}
