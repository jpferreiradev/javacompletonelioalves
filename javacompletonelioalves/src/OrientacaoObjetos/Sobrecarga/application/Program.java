package OrientacaoObjetos.Sobrecarga.application;

import OrientacaoObjetos.Sobrecarga.entities.Product;

import java.awt.*;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Price:" );
        double price = scan.nextDouble();
        Product product = new Product(name,price); // Aqui você obriga a informar os dados do produto no momento da instanciação dele

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
