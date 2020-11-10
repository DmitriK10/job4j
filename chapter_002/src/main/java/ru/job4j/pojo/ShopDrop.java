package ru.job4j.pojo;

/**
 * Класс ShopDrop.
 * 3.2. Удаление моделей из массива. [#310016]
 * алгоритм перемещения заполненных ячеек в начало массива.
 * @author Dmitry Kupriyanyuk (kupriyanyuk.d@yandex.ru)
 * @version $Id$
 * @since 10.11.20
 */
public class ShopDrop {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName());
        }
    }
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = index; i < products.length; i++) {
            if ((i + 1) < products.length) {
                products[i] = products[i + 1];
            } else {
                products[i] = null;
            }

        }
        return products;
    }
}