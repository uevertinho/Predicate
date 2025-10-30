package util;

import entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    //Uma função que retorna um booleano
    //se a condição for verdadeira
    //a função também vai retornar um valor verdadeiro
    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
