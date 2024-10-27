package com.SexShop.Sex.ShopService;

import com.SexShop.Sex.ShopEntity.Clientes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientesService {

    private List<Clientes> clientes;

    public ClientesService() {
        clientes = new ArrayList<>();
        clientes.add(new Clientes(UUID.randomUUID(),"Daniel","felicesLosDos",1234456,31243567));
        clientes.add(new Clientes(UUID.randomUUID(), "Pedro", "megustaTodo", 1234456, 31243567));
        clientes.add(new Clientes(UUID.randomUUID(), "Maria", "smileAgain", 4567891, 31567890));
        clientes.add(new Clientes(UUID.randomUUID(), "Carlos", "carLoco12", 7890123, 31456789));
        clientes.add(new Clientes(UUID.randomUUID(), "Lucia", "lucyLove", 2345678, 31045678));
        clientes.add(new Clientes(UUID.randomUUID(), "Jorge", "jorge21", 6789012, 31987654));
        clientes.add(new Clientes(UUID.randomUUID(), "Ana", "happyLife", 3456789, 31876543));
        clientes.add(new Clientes(UUID.randomUUID(), "Miguel", "miggy33", 9012345, 31765432));
        clientes.add(new Clientes(UUID.randomUUID(), "Sofia", "sofiStar", 1236789, 31654321));
        clientes.add(new Clientes(UUID.randomUUID(), "Pedro", "pedrito89", 5678901, 31543210));
        clientes.add(new Clientes(UUID.randomUUID(), "Camila", "camiCool", 7890123, 31432109));
    }
    public List<Clientes>getAllCliente(){
        return clientes;
    }
    public Optional<Clientes> getClientesByid(UUID idClientes){
        return clientes.stream().filter(clientes -> clientes.getIdCliente().equals(idClientes)).findFirst();
    }
    public List<Clientes> createCliente(Clientes clientes) {
        clientes.setNombreCliente(clientes.getNombreCliente());
        return  createCliente(clientes);
    }

    // Actualizar un cliente existente
    public Optional<Clientes> updateCliente(UUID idCLientes, Clientes clienteActualizado) {
        for (int i = 0; i < clientes.size(); i++) {
            Clientes cliente = clientes.get(i);
            if (cliente.idCliente().equals(idCLientes)) {
                cliente.setNombreCliente(clienteActualizado.getNombreCliente());
                cliente.setProvedor(clienteActualizado.getProvedor());
                cliente.setIdetificacion(clienteActualizado.getIdetificacion());
                cliente.setTelefono(clienteActualizado.getTelefono());
                return Optional.of(cliente);
            }
        }
        return Optional.empty(); // Devuelve vacío si el cliente no fue encontrado
    }

    // Eliminar un cliente
    public boolean deleteCliente(UUID idClientes) {
        return clientes.removeIf(cliente -> cliente.getIdCliente().equals(idClientes));
    }
}
