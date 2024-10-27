package com.SexShop.Sex.ShopEntity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCliente;
    private String nombreCliente;
    private String provedor;
    private int idetificacion;
    private int telefono;

    public Clientes setId(UUID idCliente, String nombreCliente, String provedor, int idetificacion, int telefono){
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.provedor = provedor;
        this.idetificacion = idetificacion;
        this.telefono = telefono;
        return this;
    }

    public UUID idCliente() {
        return idCliente;
    }

    public Clientes setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
        return this;
    }

    public String nombreCliente() {
        return nombreCliente;
    }

    public Clientes setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        return this;
    }

    public String provedor() {
        return provedor;
    }

    public Clientes setProvedor(String provedor) {
        this.provedor = provedor;
        return this;
    }

    public int idetificacion() {
        return idetificacion;
    }

    public Clientes setIdetificacion(int idetificacion) {
        this.idetificacion = idetificacion;
        return this;
    }

    public int telefono() {
        return telefono;
    }

    public Clientes setTelefono(int telefono) {
        this.telefono = telefono;
        return this;
    }
}
