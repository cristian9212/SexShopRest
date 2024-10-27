package com.SexShop.Sex.ShopService;


import com.SexShop.Sex.ShopEntity.Empleados;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EmpleadosService {

    private List<Empleados> empleados;

    public EmpleadosService(){
        empleados = new ArrayList<>();
        empleados.add(new Empleados(UUID.randomUUID(),"Carlos","Lopez",10609233,25,3124556));
        empleados.add(new Empleados(UUID.randomUUID(), "Carlitos", "Mesu", 106044233, 23, 31245786));
        empleados.add(new Empleados(UUID.randomUUID(), "Ana", "Garcia", 10713456, 30, 3176543));
        empleados.add(new Empleados(UUID.randomUUID(), "Luis", "Martinez", 10876543, 28, 3156789));
        empleados.add(new Empleados(UUID.randomUUID(), "Sofia", "Mendoza", 10987654, 35, 3145678));
        empleados.add(new Empleados(UUID.randomUUID(), "Pedro", "Ramirez", 11098765, 40, 3187654));
        empleados.add(new Empleados(UUID.randomUUID(), "Mariana", "Perez", 11123456, 27, 3198765));
        empleados.add(new Empleados(UUID.randomUUID(), "Jorge", "Sanchez", 11234567, 32, 3123456));
        empleados.add(new Empleados(UUID.randomUUID(), "Lucia", "Fernandez", 11345678, 26, 3165432));
        empleados.add(new Empleados(UUID.randomUUID(), "Fernando", "Diaz", 11456789, 29, 3134567));
        empleados.add(new Empleados(UUID.randomUUID(), "Gabriela", "Hernandez", 11567890, 31, 3112345));
    }
    public List<Empleados> getAllEmpleado(){
        return empleados;
    }
    public Optional<Empleados> getEmpleadosById(UUID idEmpleado){
        return  empleados.stream().filter(empleados -> empleados.apellidoEmpleado().equals(idEmpleado)).findFirst();
    }
    public List<Empleados> createEmpleado(Empleados empleados) {
        empleados.setNombreEmpleado(empleados.getNombreEmpleado());
        return createEmpleado(empleados);
    }
    public Optional<Empleados> updateEmpleado(UUID id, Empleados empleadoActualizado) {
        for (int i = 0; i < empleados.size(); i++) {
            Empleados empleado = empleados.get(i);
            if (empleado.idEmpleado().equals(id)) {
                empleado.setNombreEmpleado(empleadoActualizado.getNombreEmpleado());
                empleado.setApellidoEmpleado(empleadoActualizado.getApellidoEmpleado());
                empleado.setNumeroIdentificacion(empleadoActualizado.getNumeroIdentificacion());
                empleado.setEdad(empleadoActualizado.getEdad());
                empleado.setTelefono(empleadoActualizado.getTelefono());
                return Optional.of(empleado);
            }
        }
        return Optional.empty();
    }
    public boolean deleteEmpleado(UUID idEmpleado) {
        return empleados.removeIf(empleados -> empleados.getIdEmpleado().equals(idEmpleado));
    }
}
