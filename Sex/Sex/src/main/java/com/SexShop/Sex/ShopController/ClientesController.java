package com.SexShop.Sex.ShopController;

import com.SexShop.Sex.ShopEntity.Clientes;
import com.SexShop.Sex.ShopService.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

/**
 * @Autor Cristian Talero
 */
@Controller
@RestController
@RequestMapping("/api/CLientes")
public class ClientesController {

    private final ClientesService clientesService;

    @Autowired
    public ClientesController(ClientesService clientesService) {
        this.clientesService = clientesService;
    }

    @GetMapping("/{id}")
    public Optional<Clientes> getClientes(@PathVariable UUID idClientes) {
        return clientesService.getClientesByid(idClientes);
    }

    @PostMapping("/consultaClientes")
    public ResponseEntity<Clientes> createClientes(@RequestBody Clientes cliente) {
        Clientes nuevoCliente = (Clientes) clientesService.createCliente(cliente);
        return ResponseEntity.ok(nuevoCliente);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Clientes> updateCliente(@PathVariable UUID id, @RequestBody Clientes cliente) {
        Optional<Clientes> clienteActualizado = clientesService.updateCliente(id, cliente);
        if (clienteActualizado.isPresent()) {
            return ResponseEntity.ok(clienteActualizado.get()); // Retorna el cliente actualizado
        } else {
            return ResponseEntity.notFound().build(); // Retorna 404 si no se encuentra el cliente
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable UUID id) {
        boolean eliminado = clientesService.deleteCliente(id);
        if (eliminado) {
            return ResponseEntity.noContent().build(); // Retorna 204 si se eliminó correctamente
        } else {
            return ResponseEntity.notFound().build(); // Retorna 404 si no se encuentra el cliente
        }
    }


}
