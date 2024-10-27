package com.SexShop.Sex.ShopController;

import com.SexShop.Sex.ShopEntity.Fragancia;
import com.SexShop.Sex.ShopService.FraganciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@Controller
@RestController
@RequestMapping("api/Fragancia")
public class FraganciaController {

    private final FraganciaService fraganciaService;

    @Autowired
    public FraganciaController(FraganciaService fraganciaService) {
        this.fraganciaService = fraganciaService;
    }
    @GetMapping("/{id}")
    public Optional<Fragancia> getFragancia(@PathVariable UUID idFragancia) {
        return fraganciaService.getFraganciasById(idFragancia);
    }
    @PostMapping("/consultarFragancia")
    public ResponseEntity<Fragancia> createFragancia(@RequestBody Fragancia fragancia) {
        Fragancia nuevaFragancia = (Fragancia) fraganciaService.createFragancia(fragancia);
        return ResponseEntity.ok(nuevaFragancia); // Retorna la fragancia creada
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fragancia> updateFragancia(@PathVariable UUID id, @RequestBody Fragancia fragancia) {
        Optional<Fragancia> fraganciaActualizada = fraganciaService.updateFragancia(id, fragancia);
        return fraganciaActualizada
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFragancia(@PathVariable UUID id) {
        boolean eliminado = fraganciaService.deleteFragancia(id);
        return eliminado
                ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }

}
