package ru.job4j.array;
/**
 * Обертка над строкой.
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 23.09.18
 */
public class EndsWith {
    /**
     * Проверяет. что слово заканчивается на префикс.
     * @param post префикс.
     * @param word проверяемое слово
     * @return если слово начинаеться с префикса
     */
    public boolean endsWith(String word, String post) {
        boolean result = true;
        char[] pst = post.toCharArray();
        char[] wrd = word.toCharArray();
        int num = 0;
        // проверить. что массив data имеет первые элементы одинаковые с value
       for (int i = wrd.length - pst.length; i < wrd.length; i++) {
            if (wrd[i] != pst[num]) {
                result = false;
                break;
            }
            num++;
        }
        return result;
    }
}

