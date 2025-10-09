public class Radio {
    private int currentStation; // текущая радиостанция (0-9)
    private int currentVolume;  // текущая громкость (0-100)

    // Конструктор
    public Radio() {
        this.currentStation = 0;
        this.currentVolume = 0;
    }

    // Методы управления станциями
    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void setStation(int station) {
        if (station >= 0 && station <= 9) {
            currentStation = station;
        }
    }

    // Методы управления громкостью
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    // Геттеры
    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}
