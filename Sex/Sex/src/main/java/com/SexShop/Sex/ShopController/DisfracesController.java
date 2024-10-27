package com.SexShop.Sex.ShopController;

import com.SexShop.Sex.ShopEntity.Disfraces;
import com.SexShop.Sex.ShopService.DisfracesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@Controller
@RestController
@RequestMapping("/api/Disfraces")
public class DisfracesController {

    private final DisfracesService disfracesService;

    @Autowired
    public DisfracesController(DisfracesService disfracesService) {
        this.disfracesService = disfracesService;
    }
    @GetMapping("/{id}")
    public Optional<Disfraces> getDisfraces(@PathVariable UUID idDisfraces) {
        return disfracesService.getDisfracesById(idDisfraces);
    }

    @PostMapping("/consultaDisfraces")
    public ResponseEntity<Disfraces> createDisfraz(@RequestBody Disfraces disfraz) {
        Disfraces nuevoDisfraz = (Disfraces) disfracesService.createDisfraz(disfraz);
        return ResponseEntity.ok(nuevoDisfraz);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Disfraces> updateDisfraz(@PathVariable UUID id, @RequestBody Disfraces disfraces) {
        Optional<Disfraces> disfrazActualizado = disfracesService.updateDisfraces(id, disfraces);
        return disfrazActualizado
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisfraz(@PathVariable UUID id) {
        boolean eliminado = disfracesService.deleteDisfraz(id);
        return eliminado
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}
