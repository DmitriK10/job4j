package ru.job4j.ex;

//0.4. Пользовательские исключения. [#219367]
public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        /* for-each */
        for  (String val : value) {
            if (val.equals(key)) {
                rsl = 1;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Key could not be -1");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] data = new String[1];
        data[0] = "pwd";
        String key = "pwd";
        try {
            indexOf(data, key);
        } catch (ElementNotFoundException q){
            q.printStackTrace();
        }
    }
}