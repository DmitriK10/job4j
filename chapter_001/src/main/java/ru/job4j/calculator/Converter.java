package ru.job4j.calculator;
/**
 * Корвертор валюты.
 * @author DKupriyanyuk
 * @version $ld$
 * @since 09.03.2018
 */
public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {
        value = value / 70;
        return value;
    }
    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {
        value = value / 60;
        return value;
    }
}
