package 싱글톤;

public class Singleton {
    String name;
    int id;
    private static Singleton singleton = new Singleton(); // 전역변수에 싱글톤 객체를 생성해서 대입, 전역 변수는 프로그램 종료 시 까지 사라지지 않음

    private Singleton(){ // 외부에서 생성자 호출 못하도록 막아주는 거임
        name = "곰돌이";
        id = 100;
    }
    static Singleton getSingleton(){ // 외부 호출 시 미리 만들어진 싱글톤 객체의 주소를 반환
        return singleton;
    }


    public static Singleton getInstance() {
        return singleton;
    }
}
