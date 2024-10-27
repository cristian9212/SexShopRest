package com.SexShop.Sex.ShopEntity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "fragancia")
public class Fragancia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idFrangancia;
    private String nombreFragancia;
    private String tipoFragancia;
    private int precio;
    private int stock;

    public Fragancia sedId(UUID idFrangancia,String nombreFragancia, String tipoFragancia, int precio, int stock){
        this.idFrangancia = idFrangancia;
        this.nombreFragancia = nombreFragancia;
        this.tipoFragancia = tipoFragancia;
        this.precio = precio;
        this.stock = stock;
        return this;
    }

    public UUID idFrangancia() {
        return idFrangancia;
    }

    public Fragancia setIdFrangancia(UUID idFrangancia) {
        this.idFrangancia = idFrangancia;
        return this;
    }

    public String nombreFragancia() {
        return nombreFragancia;
    }

    public Fragancia setNombreFragancia(String nombreFragancia) {
        this.nombreFragancia = nombreFragancia;
        return this;
    }

    public String tipoFragancia() {
        return tipoFragancia;
    }

    public Fragancia setTipoFragancia(String tipoFragancia) {
        this.tipoFragancia = tipoFragancia;
        return this;
    }

    public int precio() {
        return precio;
    }

    public Fragancia setPrecio(int precio) {
        this.precio = precio;
        return this;
    }

    public int stock() {
        return stock;
    }

    public Fragancia setStock(int stock) {
        this.stock = stock;
        return this;
    }
}
