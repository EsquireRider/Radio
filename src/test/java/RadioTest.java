import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void ValidNumberRadio() {
        Radio radio = new Radio();

        radio.setNumberRadio(5);

        int expected = 5;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AboveMaxNumberRadio() {
        Radio radio = new Radio();

        radio.setNumberRadio(10);

        int expected = 0;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void BelowMinNumberRadio() {
        Radio radio = new Radio();

        radio.setNumberRadio(-1);

        int expected = 0;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberRadio() {
        Radio radio = new Radio();

        radio.setNumberRadio(5);
        radio.nextNumberRadio();

        int expected = 6;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberRadioAtMax() {
        Radio radio = new Radio();

        radio.setNumberRadio(9);
        radio.nextNumberRadio();

        int expected = 0;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberRadioAtMin() {
        Radio radio = new Radio();

        radio.setNumberRadio(0);
        radio.prevNumberRadio();

        int expected = 9;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberRadio() {
        Radio radio = new Radio();

        radio.setNumberRadio(5);
        radio.prevNumberRadio();

        int expected = 4;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeNormal() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.increaseCurrentVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeAtMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeNormal() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.decreaseCurrentVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeAtMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
