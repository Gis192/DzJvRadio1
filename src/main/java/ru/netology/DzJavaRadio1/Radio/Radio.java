package ru.netology.DzJavaRadio1.Radio;

public class Radio {
    private int currentStation;
    private int levelVolume;
    private int maxNumberStation;

    public Radio() {
        maxNumberStation = 9;
    }

    public Radio(int stationsCount) {
        maxNumberStation = stationsCount - 1;
    }

    public int getMaxNumberStation() {
        return maxNumberStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxNumberStation) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void nextStation() {
        if (currentStation < maxNumberStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = maxNumberStation;
        }
    }

    public int getLevelVolume() {
        return levelVolume;
    }

    public void setLevelVolume(int levelVolume) {
        this.levelVolume = levelVolume;
    }

    public void nextVolume() {
        if (levelVolume < 100) {
            levelVolume++;
        } else {
            levelVolume = 100;
        }
    }

    public void prevVolume() {
        if (levelVolume > 0) {
            levelVolume--;
        } else {
            levelVolume = 0;
        }
    }
}
