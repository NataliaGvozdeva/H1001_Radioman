package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public void setStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        }
    }

    public int getStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
            return;
        }
        currentStation++;
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        currentStation--;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 10) {
            this.currentVolume = volume;
        }
    }

    public int getVolume() {
        return currentVolume;
    }

    public void increaseVolume() {

        int target = getVolume();

        if (target < 10) {
            setVolume(target + 1);
        }
    }

    public void decreaseVolume() {

        int target = getVolume();

        if (target > 0) {
            setVolume(target - 1);
        }
    }


}
