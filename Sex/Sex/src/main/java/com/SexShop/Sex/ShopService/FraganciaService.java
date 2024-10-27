package com.SexShop.Sex.ShopService;

import com.SexShop.Sex.ShopEntity.Fragancia;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class FraganciaService {

    private List<Fragancia> fragancias;

    public FraganciaService(){
        fragancias = new ArrayList<>();
        fragancias.add(new Fragancia(UUID.randomUUID(),"activaSex","afrodisiaco",25000,14));
        fragancias.add(new Fragancia(UUID.randomUUID(), "actiSex", "fereomonas", 33000, 17));
        fragancias.add(new Fragancia(UUID.randomUUID(), "freshBlue", "citrico", 15000, 30));
        fragancias.add(new Fragancia(UUID.randomUUID(), "mysticNight", "oriental", 30000, 20));
        fragancias.add(new Fragancia(UUID.randomUUID(), "wildRose", "floral", 18000, 25));
        fragancias.add(new Fragancia(UUID.randomUUID(), "coolOcean", "acuatico", 20000, 18));
        fragancias.add(new Fragancia(UUID.randomUUID(), "spicyLeather", "amaderado", 35000, 10));
        fragancias.add(new Fragancia(UUID.randomUUID(), "vanillaDream", "gourmand", 28000, 15));
        fragancias.add(new Fragancia(UUID.randomUUID(), "citrusPunch", "citrico", 16000, 22));
        fragancias.add(new Fragancia(UUID.randomUUID(), "amberMystery", "oriental", 32000, 8));
        fragancias.add(new Fragancia(UUID.randomUUID(), "lavenderFields", "aromatico", 22000, 12));

    }
    public List<Fragancia> getAllFragancia() {
        return fragancias;

    }
    public Optional<Fragancia> getFraganciasById(UUID idFrangancia) {
        return fragancias.stream().filter(fragancia -> fragancia.getIdFrangancia().equals(idFrangancia)).findFirst();
    }
    public List<Fragancia> createFragancia(Fragancia fragancias) {
        fragancias.setNombreFragancia(fragancias.getNombreFragancia());
        return createFragancia(fragancias);
    }
    public Optional<Fragancia> updateFragancia(UUID id, Fragancia fraganciaActualizada) {
        for (int i = 0; i < fragancias.size(); i++) {
            Fragancia fragancia = fragancias.get(i);
            if (fragancia.getIdFrangancia().equals(id)) {
                fragancia.setNombreFragancia(fraganciaActualizada.getNombreFragancia());
                fragancia.setTipoFragancia(fraganciaActualizada.getTipoFragancia());
                fragancia.setPrecio(fraganciaActualizada.getPrecio());
                fragancia.setStock(fraganciaActualizada.getStock());
                return Optional.of(fragancia);
            }
        }
        return Optional.empty();
    }
    public boolean deleteFragancia(UUID id) {
        return fragancias.removeIf(fragancia -> fragancia.getIdFrangancia().equals(id));
    }

}
