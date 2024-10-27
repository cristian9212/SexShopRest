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
@Table(name = "juquetes")
public class Juguetes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idJuguete;
    private String nombreJuguete;
    private String categoria;
    private  int precio;
    private  int stock;

    public Juguetes setId(UUID idJuguete, String nombreJuguete, String categoria, int precio, int stock) {
        this.idJuguete = idJuguete;
        this.nombreJuguete = nombreJuguete;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        return this;
    }

    public UUID idJuguete() {
        return idJuguete;
    }

    public Juguetes setIdJuguete(UUID idJuguete) {
        this.idJuguete = idJuguete;
        return this;
    }

    public String nombreJuguete() {
        return nombreJuguete;
    }

    public Juguetes setNombreJuguete(String nombreJuguete) {
        this.nombreJuguete = nombreJuguete;
        return this;
    }

    public String categoria() {
        return categoria;
    }

    public Juguetes setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    public int precio() {
        return precio;
    }

    public Juguetes setPrecio(int precio) {
        this.precio = precio;
        return this;
    }

    public int stock() {
        return stock;
    }

    public Juguetes setStock(int stock) {
        this.stock = stock;
        return this;
    }
}
