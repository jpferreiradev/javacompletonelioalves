package courseOld.OrientacaoObjetos.Encapsulamento.application;

import courseOld.OrientacaoObjetos.Encapsulamento.entities.Product;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Price:");
        double price = scan.nextDouble();
        //System.out.println("Quantity in stock: ");
        //int quantity = scan.nextInt();
        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Update name: " + product.getName());
        product.setPrice(1200);
        System.out.println("Update price: " + product.getPrice());


        System.out.println();
        System.out.println("Product data:" + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data:" + product);
    }


}
