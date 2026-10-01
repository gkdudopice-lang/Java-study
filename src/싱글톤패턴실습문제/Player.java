package 싱글톤패턴실습문제;

public class Player {
    GameSettings settings= GameSettings.getGameSettings();

    void setSettings(int resolution, int volume, int difficulty){
        settings.resolution = resolution;
        settings.volume = volume;
        settings.difficulty = difficulty;

    }

    public void print(){
        System.out.println("해상도: " + settings.resolution);
        System.out.println("음량: " + settings.volume);
        System.out.println("난이도: " + settings.difficulty);
    }
}
