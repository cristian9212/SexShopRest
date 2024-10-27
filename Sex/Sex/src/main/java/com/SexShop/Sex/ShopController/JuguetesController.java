package com.SexShop.Sex.ShopController;

import com.SexShop.Sex.ShopEntity.Juguetes;
import com.SexShop.Sex.ShopService.JuquetesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@Controller
@RestController
@RequestMapping("/api/Juguetes")
public class JuguetesController {

    private final JuquetesService juguetesService;

    @Autowired
    public JuguetesController(JuquetesService juquetesService) {
        this.juguetesService = juquetesService;
    }
    @GetMapping("/{id}")
    public Optional<Juguetes> getJuguetes(@PathVariable UUID idJuguetes){
        return juguetesService.getJugueteById(idJuguetes);
    }
    @PostMapping("/consultarJuguete")
    public ResponseEntity<Juguetes> createJuguete(@RequestBody Juguetes juguete) {
        Juguetes nuevoJuguete = (Juguetes) juguetesService.createJuguete(juguete);
        return ResponseEntity.ok(nuevoJuguete);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Juguetes> updateJuguete(@PathVariable UUID id, @RequestBody Juguetes juguete) {
        Optional<Juguetes> jugueteActualizado = juguetesService.updateJuguete(id, juguete);
        return jugueteActualizado
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJuguetes(@PathVariable UUID id) {
        boolean eliminado = juguetesService.deleteJuguetes(id);
        if (eliminado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
