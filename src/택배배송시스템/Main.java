//package 택배배송시스템;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Delivery delivery = new Delivery("StringCompany");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("배송 방법 선택 [1] 일반배송 [2] 당일배송 [3] 해외배송");
//        int menu = sc.nextInt();
//
//        switch (menu) {
//            case 1:
//                delivery.delivery(new ParcelDelivery());
//                break;
//            case 2:
//                delivery.delivery(new QuickDelivery());
//                break;
//            case 3:
//                delivery.delivery(new AirDelivery());
//                break;
//            default:
//                System.out.print("배송 선택이 잘못 되었습니다.");
//
//
//        }
//    }
//}
