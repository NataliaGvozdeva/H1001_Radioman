package ru.netology.domain;

public class Radio {

    public int currentStation;
    public int currentVolume;

    public void setStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        }

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
            currentVolume = volume;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= 0 && currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        if (currentVolume < 0 || currentVolume > 10) {
            currentVolume = 0;
        }

    }

    public void decreaseVolume() {
        if (currentVolume > 0 && currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }

        if (currentVolume < 0 || currentVolume > 10) {
            currentVolume = 0;
        }
    }


}
