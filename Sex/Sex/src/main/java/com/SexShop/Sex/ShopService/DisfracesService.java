package com.SexShop.Sex.ShopService;

import com.SexShop.Sex.ShopEntity.Disfraces;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DisfracesService {

    private List<Disfraces> disfraces;

    public DisfracesService(){
        disfraces = new ArrayList<>();
        disfraces.add(new Disfraces(UUID.randomUUID(),"Emfermera","medicos",1000,22));
        disfraces.add(new Disfraces(UUID.randomUUID(), "Enfermera", "medicos", 1000, 22));
        disfraces.add(new Disfraces(UUID.randomUUID(), "Bombero", "profesionales", 1500, 15));
        disfraces.add(new Disfraces(UUID.randomUUID(), "Pirata", "aventura", 1200, 30));
        disfraces.add(new Disfraces(UUID.randomUUID(), "Vampiro", "halloween", 1800, 25));
        disfraces.add(new Disfraces(UUID.randomUUID(), "Princesa", "fantasia", 1300, 20));
        disfraces.add(new Disfraces(UUID.randomUUID(), "Policía", "profesionales", 1400, 18));
        disfraces.add(new Disfraces(UUID.randomUUID(), "Zombie", "halloween", 1100, 28));
        disfraces.add(new Disfraces(UUID.randomUUID(), "Superhéroe", "superheroes", 2000, 12));
        disfraces.add(new Disfraces(UUID.randomUUID(), "Astronauta", "ciencia", 1700, 10));
        disfraces.add(new Disfraces(UUID.randomUUID(), "Payaso", "circo", 900, 35));
    }
    public  List<Disfraces> getAllDisfraces(){
        return disfraces;
    }
    public Optional<Disfraces> getDisfracesById(UUID idDisfraces){
        return  disfraces.stream().filter(disfraces -> disfraces.getIdDisfras().equals(idDisfraces)).findFirst();
    }
    public List<Disfraces> createDisfraz(Disfraces disfraces) {
        disfraces.setNombreDisfras(String.valueOf(getAllDisfraces().add(disfraces)));
      return createDisfraz(disfraces);
    }
    public Optional<Disfraces> updateDisfraces(UUID id, Disfraces disfrazActualizado) {
        for (int i = 0; i < disfraces.size(); i++) {
            Disfraces disfras = disfraces.get(i);
            if (disfras.getIdDisfras().equals(id)) {
                disfras.setTipoDisfras(disfrazActualizado.getNombreDisfras());
                disfras.setTipoDisfras(disfrazActualizado.getTipoDisfras());
                disfras.setPrecio(disfrazActualizado.getPrecio());
                disfras.setStock(disfrazActualizado.getStock());
                return Optional.of(disfras);
            }
        }
        return Optional.empty();
    }
    public boolean deleteDisfraz(UUID id) {
        return disfraces.removeIf(disfraz -> disfraz.getIdDisfras().equals(id));
    }
}
