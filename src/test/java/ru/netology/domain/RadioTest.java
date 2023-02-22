package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {
    @Test
    public void shouldInitialiseStation() {

        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.setStation(0);

        int expected = 0;
        int actual = radio.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldInitialiseVolume() {

        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setstation.csv")
    public void shouldSetStation(int station, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.setStation(station);

        int actual = radio.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setstationrange.csv")
    public void shouldSetStationRange(int stationRange, int expected) {
        Radio radio = new Radio(stationRange);

        // вызываем целевой метод:
        radio.setStation(stationRange-1);

        int actual = radio.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setvolume.csv")
    public void shouldSetVolume(int volume, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.setVolume(volume);

        int actual = radio.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setnextstation.csv")
    public void shouldSetNextStation(int currentStation, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.setStation(currentStation);
        radio.nextStation();

        int actual = radio.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setnextnotdefaultstation.csv")
    public void shouldSetNextNotDefaultStation(int stationRange, int currentStation, int expected) {
        Radio radio = new Radio(stationRange);

        // вызываем целевой метод:
        radio.setStation(currentStation);
        radio.nextStation();

        int actual = radio.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setprevstation.csv")
    public void shouldSetPrevStation(int currentStation, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.setStation(currentStation);
        radio.prevStation();

        int actual = radio.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setprevnotdefaultstation.csv")
    public void shouldSetPrevNotDefaultStation(int stationRange, int currentStation, int expected) {
        Radio radio = new Radio(stationRange);

        // вызываем целевой метод:
        radio.setStation(currentStation);
        radio.prevStation();

        int actual = radio.getStation();

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increasevolume.csv")
    public void shouldIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.setVolume(currentVolume);
        radio.increaseVolume();

        int actual = radio.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/decreasevolume.csv")
    public void shouldDecreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();

        // вызываем целевой метод:
        radio.setVolume(currentVolume);
        radio.decreaseVolume();

        int actual = radio.getVolume();

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}
