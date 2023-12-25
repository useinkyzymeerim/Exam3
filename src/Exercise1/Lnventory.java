package Exercise1;

import java.util.ArrayList;

public class Lnventory {
    public static ArrayList<String>  product = new ArrayList<>();

    public static void main(String[] args) {

        addProduct("grapes");
        addProduct("cherry");
        addProduct("water");
        addProduct("apple");


        removeProduct("grapes");

        searchProduct("apple");


        searchProduct("apple");

        System.out.println(product);


    }

    public static void addProduct(String name) {
        product.add(name);
    }

    public static void removeProduct(String name) {
        product.remove(name);
    }

    public static void searchProduct(String name)  {
        for (String i : product) {
            if (i == name) {
                System.out.println("Такой продукт уже существует");

            }
        }

    }

}
