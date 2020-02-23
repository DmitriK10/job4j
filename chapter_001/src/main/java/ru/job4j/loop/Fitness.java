package ru.job4j.loop;

/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 05.07.19
 */
public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            month++;
            ivan = ivan * 3;
            nik = nik * 2;
        }
        return month;
    }
}