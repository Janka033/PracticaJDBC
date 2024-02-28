package org.example.modelo;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Product {
    private String id;
    private String name;
    private String marca;
    private double cilindraje;
    private double price;
}
