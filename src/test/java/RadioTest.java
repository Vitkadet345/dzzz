import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    public void testNextStation() {
        Radio radio = new Radio();

        // Базовый случай
        radio.setStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());

        // Переход с 9 на 0
        radio.setStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testPrevStation() {
        Radio radio = new Radio();

        // Базовый случай
        radio.setStation(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());

        // Переход с 0 на 9
        radio.setStation(0);
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testSetStation() {
        Radio radio = new Radio();

        // Проверка допустимых значений
        radio.setStation(0);
        assertEquals(0, radio.getCurrentStation());

        // Проверка недопустимых значений
        radio.setStation(-1);
        assertEquals(0, radio.getCurrentStation());

        radio.setStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testVolumeControl() {
        Radio radio = new Radio();

        // Увеличение громкости
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());

        // Достижение максимума
        for (int i = 0; i < 99; i++) {
            radio.increaseVolume();
        }
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());

        // Уменьшение громкости
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolume());

        // Достижение минимума
        for (int i = 0; i < 99; i++) {
            radio.decreaseVolume();
        }
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
