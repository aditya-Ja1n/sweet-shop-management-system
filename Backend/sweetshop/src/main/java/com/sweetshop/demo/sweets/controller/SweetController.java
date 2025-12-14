package com.sweetshop.demo.sweets.controller;

import com.sweetshop.demo.sweets.model.Sweet;
import com.sweetshop.demo.sweets.service.SweetService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sweets")
@RequiredArgsConstructor
public class SweetController {

    private final SweetService sweetService;

    @PostMapping
    public Sweet addSweet(@Valid @RequestBody Sweet sweet) {
        return sweetService.addSweet(sweet);
    }

    @GetMapping
    public List<Sweet> getAllSweets() {
        return sweetService.getAllSweets();
    }

    @GetMapping("/search")
    public List<Sweet> searchSweets(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String category,
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice) {
        return sweetService.searchSweets(name, category, minPrice, maxPrice);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        sweetService.deleteSweet(id);
    }
}
