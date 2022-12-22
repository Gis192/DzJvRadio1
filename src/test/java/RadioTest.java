import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.DzJavaRadio1.Radio.Radio;

public class RadioTest {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "5,5",
                    "10,0",
                    "9,9",
                    "8,8",
                    "11,0",
                    "0,0",
                    "-1,0",
                    "-2,0"
            }
    )
    public void tetsSetStation(int setStation, int expected) {
        Radio radio = new Radio();

        radio.setCurrentStation(setStation);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "5,6",
                    "9,0",
                    "8,9",
                    "0,1",
            }
    )
    public void tetsSetNextStation(int setStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(setStation);

        radio.nextStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "6,5",
                    "1,0",
                    "0,9",
                    "9,8",
            }
    )
    public void tetsSetPrevStation(int setStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(setStation);

        radio.prevStation();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "5,6",
                    "98,99",
                    "99,100",
                    "100,100",
                    "1,2",
            }
    )
    public void tetsSetNextVolume(int setVolume, int expected) {
        Radio radio = new Radio();
        radio.setLevelVolume(setVolume);

        radio.nextVolume();

        int actual = radio.getLevelVolume();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "6,5",
                    "2,1",
                    "1,0",
                    "0,0",
                    "10,9",
            }
    )
    public void tetsSetPrevVolume(int setVolume, int expected) {
        Radio radio = new Radio();
        radio.setLevelVolume(setVolume);

        radio.prevVolume();

        int actual = radio.getLevelVolume();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "30,29",
                    "40,39",
                    "1,0"
            }
    )
    public void tetsSetCountStation(int stationsCount, int expected) {
        Radio count = new Radio(stationsCount);

        int actual = count.getMaxNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "30,15,15",
                    "40,39,39",
                    "40,40,0",
                    "40,41,0",
                    "1, 0,0",
                    "1,1,0",
                    "0,0,0",
                    "2, 1,1"
            }
    )
    public void tetsSetCountAndNumberStation(int stationsCount, int setStation, int expected) {
        Radio count = new Radio(stationsCount);
        count.setCurrentStation(setStation);

        int actual = count.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "40,38,39",
                    "20,19,0",
                    "20,18,19",
                    "20,0,1",
                    "20, 1,2"
            }
    )
    public void tetsCountAndNextStation(int stationsCount, int setStation, int expected) {
        Radio count = new Radio(stationsCount);
        count.setCurrentStation(setStation);

        count.nextStation();

        int actual = count.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "20,0,19",
                    "20,19,18",
                    "20,18,17",
                    "20,1,0",
                    "20, 2,1"
            }
    )
    public void tetsCountAndPrevStation(int stationsCount, int setStation, int expected) {
        Radio count = new Radio(stationsCount);
        count.setCurrentStation(setStation);

        count.prevStation();

        int actual = count.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
