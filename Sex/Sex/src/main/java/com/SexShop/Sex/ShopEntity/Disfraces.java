package com.SexShop.Sex.ShopEntity;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Disfraces {

    private UUID idDisfras;
    private String nombreDisfras;
    private String tipoDisfras;
    private int precio;
    private int stock;


    public Disfraces setId(UUID idDisfras, String nombreDisfras, String tipoDisfras, int precio, int stock) {
        this.idDisfras = idDisfras;
        this.nombreDisfras = nombreDisfras;
        this.tipoDisfras = tipoDisfras;
        this.precio = precio;
        this.stock = stock;
        return this;
    }
}
