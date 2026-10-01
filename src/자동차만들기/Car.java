package 자동차만들기;

public abstract class Car {
    public int speed;
    public double fuelEfficiency;
    public int fuelTankSize;
    public int seatCount;
    public String carName;

    public Car(int speed, double fuelEfficiency, int fuelTankSize, int seatCount, String carName){
        this.speed = speed;
        this.fuelEfficiency = fuelEfficiency;
        this.fuelTankSize = fuelTankSize;
        this.seatCount = seatCount;
        this.carName = carName;
    }

    // [1번] 총 이동 횟수: ceil(승객 수 / 좌석 수)
    public int getMoveCount(int passengerCount) {
        return (int) Math.ceil((double) passengerCount / seatCount);
    }

    // [2번] 총 이동 거리: 거리 × 횟수
    public double getTotalDistance(int passengerCount, int distance) {
        return distance * getMoveCount(passengerCount);
    }

    // [3번] 총 연료 소모량: 이동 거리 / 연비
    public double getTotalFuel(int passengerCount, int distance) {
        return getTotalDistance(passengerCount, distance) / fuelEfficiency;
    }

    // [4번] 총 주유 횟수: ceil(총 연료 소모량 / 연료탱크 크기)
    public int getRefuelCount(int passengerCount, int distance) {
        return (int) Math.ceil(getTotalFuel(passengerCount, distance) / fuelTankSize);
    }

    // [5번] 총 비용: 총 연료 소모량 × 2,000원
    public int getTotalCost(int passengerCount, int distance) {
        return (int) (getTotalFuel(passengerCount, distance) * 2000);
    }

    // [6번] 이동 시간: (거리 ÷ 속도) × 횟수 × 날씨 보정계수
    public double getMovingTime(int passengerCount, int distance, double weatherFactor) {
        return ((double) distance / speed) * getMoveCount(passengerCount) * weatherFactor;
    }

    public abstract void setMode(boolean isOn);
}
