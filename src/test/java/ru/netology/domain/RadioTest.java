package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @Test
    public void shouldInitialiseStation() {

        Radio radio = new Radio();

        radio.currentStation = 0;

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldInitialiseVolume() {

        Radio radio = new Radio();

        radio.currentVolume = 0;

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setstation.csv")
    public void shouldSetStation(int station, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.setStation(station);

        int actual = radio.currentStation;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setvolume.csv")
    public void shouldSetVolume(int volume, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.setVolume(volume);

        int actual = radio.currentVolume;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setnextstation.csv")
    public void shouldSetNextStation(int currentStation, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.currentStation = currentStation;
        radio.nextStation();

        int actual = radio.currentStation;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setprevstation.csv")
    public void shouldSetPrevStation(int currentStation, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.currentStation = currentStation;
        radio.prevStation();

        int actual = radio.currentStation;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increasevolume.csv")
    public void shouldIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.currentVolume = currentVolume;
        radio.increaseVolume();

        int actual = radio.currentVolume;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreasevolume.csv")
    public void shouldDecreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.currentVolume = currentVolume;
        radio.decreaseVolume();

        int actual = radio.currentVolume;

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}
