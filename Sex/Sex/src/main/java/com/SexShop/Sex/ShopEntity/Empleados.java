package com.SexShop.Sex.ShopEntity;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Empleados {

    private UUID idEmpleado;
    private String nombreEmpleado;
    private String apellidoEmpleado;
    private int numeroIdentificacion;
    private int edad;
    private int telefono;

    public Empleados setId(UUID idEmpleado, String nombreEmpleado, String apellidoEmpleado, int numeroIdentificacion, int edad, int telefono){
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.numeroIdentificacion = numeroIdentificacion;
        this.edad = edad;
        this.telefono = telefono;
        return this;
    }

    public UUID idEmpleado() {
        return idEmpleado;
    }

    public Empleados setIdEmpleado(UUID idEmpleado) {
        this.idEmpleado = idEmpleado;
        return this;
    }

    public String nombreEmpleado() {
        return nombreEmpleado;
    }

    public Empleados setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        return this;
    }

    public String apellidoEmpleado() {
        return apellidoEmpleado;
    }

    public Empleados setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
        return this;
    }

    public int numeroIdentificacion() {
        return numeroIdentificacion;
    }

    public Empleados setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
        return this;
    }

    public int edad() {
        return edad;
    }

    public Empleados setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public int telefono() {
        return telefono;
    }

    public Empleados setTelefono(int telefono) {
        this.telefono = telefono;
        return this;
    }
}
