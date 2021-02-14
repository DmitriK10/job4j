package ru.job4j.ex;

//0.4. Пользовательские исключения. [#219367]
public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for  (int i = 0;  i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Key not found");
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

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String abus : abuses) {
            if (abus.equals(value)) {
                throw new ElementAbuseException("Key forbidden");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}