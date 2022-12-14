import org.junit.jupiter.api.Assertions;
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
    public void tetsSetStation( int setStation, int expected ){
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
    public void tetsSetNextStation( int setStation, int expected ){
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
    public void tetsSetPrevStation( int setStation, int expected ){
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
                    "9,10",
                    "10,10",
                    "0,1",
                    "1,2",
            }
    )
    public void tetsSetNextVolume( int setVolume, int expected ){
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
    public void tetsSetPrevVolume( int setVolume, int expected ){
        Radio radio = new Radio();
        radio.setLevelVolume(setVolume);

        radio.prevVolume();

        int actual = radio.getLevelVolume();

        Assertions.assertEquals(expected, actual);

    }
}
