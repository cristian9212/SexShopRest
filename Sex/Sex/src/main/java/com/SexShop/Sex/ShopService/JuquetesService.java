package com.SexShop.Sex.ShopService;


import com.SexShop.Sex.ShopEntity.Juguetes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class JuquetesService {

    private List<Juguetes> juguetes;

    public JuquetesService(){
        juguetes = new ArrayList<>();
        juguetes.add(new Juguetes(UUID.randomUUID(),"Dildo","Electrico",35000,44));
        juguetes.add(new Juguetes(UUID.randomUUID(), "Dildo", "Electrico", 35000, 44));
        juguetes.add(new Juguetes(UUID.randomUUID(), "Vibrador", "Portátil", 30000, 20));
        juguetes.add(new Juguetes(UUID.randomUUID(), "Anillo", "Reutilizable", 15000, 30));
        juguetes.add(new Juguetes(UUID.randomUUID(), "Masturbador", "Manual", 25000, 15));
        juguetes.add(new Juguetes(UUID.randomUUID(), "Plug", "Pequeño", 12000, 25));
        juguetes.add(new Juguetes(UUID.randomUUID(), "Bolas Chinas", "Silicona", 18000, 40));
        juguetes.add(new Juguetes(UUID.randomUUID(), "Estimulador", "Recargable", 40000, 10));
        juguetes.add(new Juguetes(UUID.randomUUID(), "Succionador", "USB", 50000, 8));
        juguetes.add(new Juguetes(UUID.randomUUID(), "Látigo", "Cuero", 10000, 18));
        juguetes.add(new Juguetes(UUID.randomUUID(), "Esposas", "Metálicas", 15000, 22));
    }
    public List<Juguetes> getAllJuguete(){
        return juguetes;
    }
    public Optional<Juguetes> getJugueteById(UUID idJuguete){
        return juguetes.stream().filter(juguete -> juguete.getIdJuguete().equals(idJuguete)).findFirst();
    }
    public List<Juguetes> createJuguete(Juguetes juguetes) {
       juguetes.setNombreJuguete(juguetes.nombreJuguete());
        return createJuguete(juguetes);
    }

    public Optional<Juguetes> updateJuguete(UUID id, Juguetes jugueteActualizado) {
        for (int i = 0; i < juguetes.size(); i++) {
            Juguetes juguete = juguetes.get(i);
            if (juguete.getIdJuguete().equals(id)) {
                // Actualiza los atributos del juguete
                juguete.setNombreJuguete(jugueteActualizado.getNombreJuguete());
                juguete.setCategoria(jugueteActualizado.getCategoria());
                juguete.setPrecio(jugueteActualizado.getPrecio());
                juguete.setStock(jugueteActualizado.getStock());
                return Optional.of(juguete);
            }
        }
        return Optional.empty();
    }
    public boolean deleteJuguetes(UUID id){
        return juguetes.removeIf(juguetes -> juguetes.getIdJuguete().equals(id));
    }
}

