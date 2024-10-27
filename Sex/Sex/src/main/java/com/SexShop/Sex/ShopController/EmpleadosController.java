package com.SexShop.Sex.ShopController;

import com.SexShop.Sex.ShopEntity.Empleados;
import com.SexShop.Sex.ShopService.EmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@Controller
@RestController
@RequestMapping("/api/Empleados")
public class EmpleadosController {

    private final EmpleadosService empleadosService;

    @Autowired
    public EmpleadosController(EmpleadosService empleadosService) {
        this.empleadosService = empleadosService;
    }
    @GetMapping("/{id}")
    public Optional<Empleados> getEmpleados(@PathVariable UUID idEmpleados) {
        return empleadosService.getEmpleadosById(idEmpleados);
    }

    @PostMapping("/consultarEmpleado")
    public ResponseEntity<Empleados> createEmpleado(@RequestBody Empleados empleado) {
        Empleados nuevoEmpleado = (Empleados) empleadosService.createEmpleado(empleado);
        return ResponseEntity.ok(nuevoEmpleado);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Empleados> updateEmpleado(@PathVariable UUID id, @RequestBody Empleados empleado) {
        Optional<Empleados> empleadoActualizado = empleadosService.updateEmpleado(id, empleado);
        return empleadoActualizado
                .map(ResponseEntity::ok) // Retorna el empleado actualizado si se encuentra
                .orElseGet(() -> ResponseEntity.notFound().build()); // Retorna 404 si no se encuentra
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpleado(@PathVariable UUID id) {
        boolean eliminado = empleadosService.deleteEmpleado(id);
        return eliminado
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }

}
