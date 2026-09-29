package 변수의자료형;

public class DataType {
    public static void main(String[] args) {
        boolean isTrue = true; // 참과 거짓 구분 용도, 1byte
        char gender = 'M'; // 문자 저장, 자바에서 문자는'', 문자열은 "", 문자는 내부적으로 정수값이 사용 됨, 부호없는 2byte
        byte bVar = 127; // 1byte, -128 ~ 127
        short sVar = 30000; // 2byte, -32768 ~32767
        int iVar = 100000; // 4byte
        long lVar = 10000000000000L; // 8byte
        float fVar = 3.14f; // 4byte
        double dVar = 3.14; // 8byte
        String name = "곰돌이"; // 문자열을 저장, 참조 타입(주소가 존재함)

        // 묵시적 형변화 : 컴파일로 자동으로 형변환을 하는 것
        int num = 10;   // 4byte
        double dNUm = 20.13;
        double rst = num + dNUm;
        System.out.println(rst);

        // 명시적 형변환: 사용자가 의도를 가지고 형변환을 하는 것
        int kor = 66;
        int mat = 33;
        int eng = 77;
        double avg = (double) (kor + mat + eng) / 3; // 명시적 형변환과 묵시적 형변환이 함께 일어남
        System.out.println(avg);


    }
}
