package 자동차만들기;

public class SportsCar extends Car implements Aircon, Audio{
    private boolean airconOn = false;
    private boolean audioOn = false;

    public SportsCar(){
        super(250, 8.0, 30, 2, "포르쉐 911");
    }

    @Override
    public void setMode(boolean isOn){
        if (isOn){
            speed = (int) (speed * 1.2);
            System.out.println("스포츠카 터보 모드 ON! (속도 20% 증가)");
        } else {
            System.out.println("스포츠카 터보 모드 OFF");
        }

        }
    @Override
    public void setAircon(boolean isOn) {
        this.airconOn = isOn;
        if (isOn) {
            fuelEfficiency *= 0.95;
            System.out.println("에어컨 ON! 연비 5% 감소");
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

    public String getStatus(){
        String status = "";
        if (airconOn) status += "에어컨 ON";
        if (audioOn) {
            if(!status.isEmpty()) status += ", ";
            status += "오디오 ON";
        }
        return status;
    }

    }

