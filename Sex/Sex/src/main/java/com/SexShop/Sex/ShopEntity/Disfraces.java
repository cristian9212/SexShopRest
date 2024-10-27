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

    public UUID idDisfras() {
        return idDisfras;
    }

    public Disfraces setIdDisfras(UUID idDisfras) {
        this.idDisfras = idDisfras;
        return this;
    }
    public String nombreDisfras() {
        return nombreDisfras;
    }

    public Disfraces setNombreDisfras(String nombreDisfras) {
        this.nombreDisfras = nombreDisfras;
        return this;
    }

    public String tipoDisfras() {
        return tipoDisfras;
    }

    public Disfraces setTipoDisfras(String tipoDisfras) {
        this.tipoDisfras = tipoDisfras;
        return this;
    }

    public int precio() {
        return precio;
    }

    public Disfraces setPrecio(int precio) {
        this.precio = precio;
        return this;
    }

    public int stock() {
        return stock;
    }

    public Disfraces setStock(int stock) {
        this.stock = stock;
        return this;
    }
}
