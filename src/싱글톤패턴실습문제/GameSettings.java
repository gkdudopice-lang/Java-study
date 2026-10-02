package 싱글톤패턴실습문제;

public class GameSettings {
    int resolution;
    int volume;
    int difficulty;
    private static GameSettings gameSettings = new GameSettings();

    private GameSettings(){
        resolution = 0;
        volume = 50;
        difficulty = 1;
    }
    static GameSettings getGameSettings(){
        return gameSettings;
    }

}
