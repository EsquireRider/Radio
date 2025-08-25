public class Radio {
    private int numberRadio;
    private int currentVolume;
    private int numberOfStations;

    public Radio() {
        this(10);
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.numberRadio = 0;
        this.currentVolume = 0;
    }

    public int getNumberRadio() {
        return numberRadio;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio < 0) {
            return;
        }
        if (newNumberRadio > 9) {
            return;
        }
        numberRadio = newNumberRadio;
    }

    public void nextNumberRadio() {
        if (numberRadio == numberOfStations - 1) {
            numberRadio = 0;
        } else {
            numberRadio = numberRadio + 1;
        }
    }

    public void prevNumberRadio() {
        if (numberRadio == 0) {
            numberRadio = numberOfStations - 1;
        } else {
            numberRadio = numberRadio - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            this.currentVolume = 100;
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void increaseCurrentVolume() {

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }
}