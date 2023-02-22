package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int amountStations;
    private int amountDefaultStations = 10;
    private int firstStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int amountStations) {

        this.amountStations = amountStations;
    }

    public Radio() {

        this.amountStations = amountDefaultStations;
    }

    public void setStation(int currentStation) {
        if (currentStation >= firstStation && currentStation <= (amountStations - 1)) {
            this.currentStation = currentStation;
        }
    }

    public int getStation() {
        return this.currentStation;
    }

    public void nextStation() {
        if (this.currentStation == (amountStations - 1)) {
            this.currentStation = firstStation;
            return;
        }
        this.currentStation++;
    }

    public void prevStation() {
        if (this.currentStation == firstStation) {
            this.currentStation = amountStations - 1;
            return;
        }
        this.currentStation--;
    }

    public void setVolume(int volume) {
        if (volume >= minVolume && volume <= maxVolume) {
            this.currentVolume = volume;
        }
    }

    public int getVolume() {
        return this.currentVolume;
    }

    public void increaseVolume() {

        int target = getVolume();

        if (target < maxVolume) {
            setVolume(target + 1);
        }
    }

    public void decreaseVolume() {

        int target = getVolume();

        if (target > minVolume) {
            setVolume(target - 1);
        }
    }

}
