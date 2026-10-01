package 자동차만들기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 지역선택
        System.out.println("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4]광주: ");
        int cityChoice = sc.nextInt();

        int distance = 0;
        if(cityChoice == 1) distance = 400;
        else if (cityChoice == 2) distance = 150;
        else if (cityChoice == 3) distance = 200;
        else if (cityChoice == 4) distance = 300;
        else{
            System.out.print("잘못된 입력입니다.");
            return;
        }

        // 2. 승객 수 입력
        System.out.print("이동할 승객 수 입력: ");
        int passengerCount = sc.nextInt();

        // 3. 차량 종류 및 이름 입력
        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스: ");
        int carChoice = sc.nextInt();

        Car car = null;
        if(carChoice == 1){
            car = new SportsCar();
        } else if (carChoice == 2){
            car = new Sedan();
        } else if (carChoice == 3){
            car = new Bus();
        } else {
            System.out.print("잘못된 차량 선택입니다.");
            return;
        }

        // 4. 부가기능 선택 (ON/OFF)
        System.out.print("부가 기능 [1]ON [2]OFF: ");
        int modeChoice = sc.nextInt();
        boolean isOn = (modeChoice == 1);
        car.setMode(isOn);

        // 4-1. 추가 인터페이스 기능 선택
        if (car instanceof Aircon){
            System.out.print("에어컨 [1]ON [2]OFF: ");
            int airconChoice = sc.nextInt();
            ((Aircon) car).setAircon(airconChoice == 1);
        }

        if (car instanceof Audio){
            System.out.print("오디오 [1]ON [2]OFF: ");
            int audioChoice = sc.nextInt();
            ((Audio) car).setAudio(audioChoice == 1);
        }

        if (car instanceof AutoPilot) {
            System.out.print("자율주행 [1]ON [2]OFF: ");
            int autoChoice = sc.nextInt();
            ((AutoPilot) car).setAutoPilot(autoChoice == 1);
        }

        // 5. 날씨 선택
        System.out.print("날씨 [1]맑음 [2]비 [3]눈: ");
        int weatherChoice = sc.nextInt();

        double weatherFactor = 1.0;
        if(weatherChoice == 1) weatherFactor = 1.0;
        else if (weatherChoice == 2) weatherFactor = 1.2;
        else if (weatherChoice == 3) weatherFactor = 1.4;

        // 6. 결과 출력
        System.out.println("\n======" + car.carName + "======");
        System.out.println("\n 총 비용: " + String.format("%,d", car.getTotalCost(passengerCount, distance)) + "원");
        System.out.println("\n 총 주유 횟수: " + car.getRefuelCount(passengerCount, distance) + "회");

        double totalTime = car.getMovingTime(passengerCount, distance, weatherFactor);
        int hours = (int) totalTime;
        int minutes = (int) Math.round((totalTime - hours) * 60);
        System.out.println("총 이동 시간 : " + hours + "시간 " + minutes + "분");

        // 켜져 있는 기능 상태 출력
        String activeStatus = "";
        if (car instanceof SportsCar){
            activeStatus = ((SportsCar) car).getStatus();
        } else if (car instanceof Sedan){
            activeStatus = ((Sedan) car).getStatus();
        } else if (car instanceof Bus){
            activeStatus = ((Bus) car).getStatus();
        }

        if (!activeStatus.equals("켜진 기능 없음")){
            System.out.println("활성 기능: " + activeStatus);
        }


    }
    }

