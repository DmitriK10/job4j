package ru.job4j.calculator;
/**
 * Программа расчета идеального веса.
 * @author DKupriyanyuk
 * @version $ld$
 * @since 10.03.2018
 */
public class Fit {
    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double manWeight(double height) {
        height = (height - 100) * 1.15;
        return height;
    }
    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    double womanWeight(double height) {
        height = (height - 110) * 1.15;
        return height;
    }
}