package ru.job4j.condition;

/**
 * Площадь прямоугольника.
 * @author DKupriyanyuk
 */
public class SqArea {
    public int square(int p, int k) {
        double h = (0.5 * p) / (1 + k);
        double s = (h * k) * h;
        return (int) s;
    }
}
