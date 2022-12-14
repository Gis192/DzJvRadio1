package ru.netology.DzJavaRadio1.Radio;

public class Radio {
    private int currentStation;
    private int levelVolume;
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if ( currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;

    }
    public void nextStation() {
        if (currentStation < 9){
            currentStation++;
        }
        else{
            currentStation = 0;
        }
    }
    public void prevStation() {
        if (currentStation > 0){
            currentStation--;
        }
        else{
            currentStation = 9;
        }
    }

    public int getLevelVolume() {
        return levelVolume;
    }

    public void setLevelVolume(int levelVolume) {
        this.levelVolume = levelVolume;
    }
    public void nextVolume() {
        if (levelVolume < 10) {
            levelVolume++;
        } else {
            levelVolume = 10;
        }
    }
    public void prevVolume () {
        if (levelVolume > 0) {
            levelVolume--;
        } else {
            levelVolume = 0;
        }
    }
}
