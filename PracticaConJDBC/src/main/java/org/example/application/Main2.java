package org.example.application;

import org.example.modelo.Product;
import org.example.repository.Repository;
import org.example.repository.impl.ProductRepositoryImpl;
import org.example.singleton.DataBaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class Main2 {
    public static void main(String[] args){
        try (Connection conn = DataBaseConnection.getInstance()){
            Repository<Product> repository = new ProductRepositoryImpl();
            System.out.println("******* List products from database");
            repository.list().stream().forEach(System.out::println);

            System.out.println("******* Get by id : 1");
            System.out.println(repository.byId(1).toString());

            System.out.println("******* save");
            Product product = new Product();
            product.setName("Xtz");
            product.setMarca("Yamaha");
            product.setCilindraje(660);
            product.setPrice(8300);
            repository.save(product);
            repository.list().forEach(System.out::println);

            System.out.println("*******Delete");
            //repository.delete(1);
            //repository.list().forEach(System.out::println);

            System.out.println("*******Update");
            Product updatedProduct = new Product();
            updatedProduct.setId("2");
            updatedProduct.setName("Yamaha MT-07");
            updatedProduct.setMarca("Yamaha");
            updatedProduct.setCilindraje(700);
            updatedProduct.setPrice(7500);

            repository.update(updatedProduct);
            repository.list().forEach(System.out::println);

        }catch (SQLException e){
            e.printStackTrace();



        }
    }
}
