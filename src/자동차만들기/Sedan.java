package 자동차만들기;

public class Sedan extends Car implements Aircon, Audio, AutoPilot{
    private boolean airconOn = false;
    private boolean audioOn = false;
    private boolean autoPilotOn = false;

    public Sedan(){
        super(200, 12.0, 45, 4, "소나타");
    }

    @Override
    public void setMode(boolean isOn){
        if (isOn){
            seatCount += 1;
            System.out.println("승용차 트렁크 좌석화 ON! (좌석 1석 추가)");
        } else {
            System.out.println("승용차 트렁크 좌석화 OFF");
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
    public void setAudio(boolean isOn) {
        this.audioOn = isOn;
        if (isOn) {
            System.out.println("오디오 ON!");
        } else {
            System.out.println("오디오 OFF");
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
        if (audioOn) {
            if (!status.isEmpty()) status += ", ";
            status += "오디오 ON";
        }
        if (autoPilotOn) {
            if (!status.isEmpty()) status += ", ";
            status += "자율주행 ON";
        }
        return status;
    }
}
