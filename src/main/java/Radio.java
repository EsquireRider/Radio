public class Radio {
    private int numberRadio;
    private int currentVolume;
    private int maxStationRadio;
    private int minStationRadio;

    public Radio(int numberOfStations) {
        if (numberOfStations > 0) {
            this.maxStationRadio = numberOfStations - 1;
        } else {
            this.maxStationRadio = 9;
        }
        this.minStationRadio = 0;
    }

    public Radio() {
        this(10);
    }


    public int getNumberRadio() {
        return numberRadio;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio < 0) {
            return;
        }
        if (newNumberRadio > maxStationRadio) {
            return;
        }
        numberRadio = newNumberRadio;
    }

    public void nextNumberRadio() {
        if (numberRadio == maxStationRadio) {
            numberRadio = 0;
        } else {
            numberRadio = numberRadio + 1;
        }
    }

    public void prevNumberRadio() {
        if (numberRadio == 0) {
            numberRadio = maxStationRadio;
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

    public int getMaxStationRadio() {
        return maxStationRadio + 1;
    }

    public int getRealMaxStationRadio() {
        return maxStationRadio;
    }
}