package ru.job4j.oop;
/**
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 09.03.19 */
public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();

        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
        ball.tryEat(ball);
    }
}
