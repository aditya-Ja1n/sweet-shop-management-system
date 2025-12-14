package com.sweetshop.demo.inventory.controller;

import com.sweetshop.demo.inventory.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sweets")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @PostMapping("{id}/purchase")
    public String purchase(
            @PathVariable Long id,
            @PathVariable int qty
    ){
        inventoryService.purchaseSweet(id, qty);
        return "Purchased";
    }

    @PostMapping("/{id}/restock")
    public String restock(
            @PathVariable Long sweetId,
            @PathVariable int quantity){
        inventoryService.restockSweet(sweetId, quantity);
        return "Restocked";
    }
}
