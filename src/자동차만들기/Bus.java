package 자동차만들기;

public class Bus extends Car implements Aircon, AutoPilot{
    private boolean airconOn = false;
    private boolean autoPilotOn = false;

    public Bus(){
        super(150, 5.0, 100, 20, "고속버스");
    }

    @Override
    public void setMode(boolean isOn){
        if (isOn){
            fuelTankSize += 30;
            System.out.println("버스 보조 연료탱크 ON! (연료탱크 30L 추가)");
        } else{
            System.out.println("버스 보조 연료탱크 OFF");
        }
    }

    @Override
    public void setAircon(boolean isOn) {
        this.airconOn = isOn;
        if (isOn) {
            fuelEfficiency *= 0.95; // 연비 5% 감소
            System.out.println("에어컨 ON! (연비 5% 감소)");
        } else {
            System.out.println("에어컨 OFF");
        }
    }

    @Override
    public void setAutoPilot(boolean isOn) {
        this.autoPilotOn = isOn;
        if (isOn) {
            speed = (int) (speed * 0.9); // 최고속도 10% 감소
            System.out.println("자율주행 ON! (최고속도 10% 감소)");
        } else {
            System.out.println("자율주행 OFF");
        }
    }

    public String getStatus() {
        String status = "";
        if (airconOn) status += "에어컨 ON";
        if (autoPilotOn) {
            if (!status.isEmpty()) status += ", ";
            status += "자율주행 ON";
        }
        return status;
    }

}
