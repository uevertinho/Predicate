package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //desse jeito é legal porque podemos pegar valor de variáveis
        //e parametrizarmos esse valor.
        //inclusive as que o usuário digitar e parametrizar na expressão
        double min = sc.nextDouble();
        Predicate<Product> pred = p -> p.getPrice() >= min;

        list.removeIf(pred);

        for (Product p : list){
            System.out.println(p);
        }
    }
}
