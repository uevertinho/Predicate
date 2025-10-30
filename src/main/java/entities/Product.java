package entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    //metodo estático trabalha com o produto que passarmos como argumento para ele
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100.0;
    }

    //metodo não estático é um metodo da instância
    //trabalha com o próprio objeto que estou
    public boolean nonstaticProductPredicate(){
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return "Product "
                + "name: "
                + name
                + ", price: "
                + String.format("%.2f",price);
    }
}
