package com.sweetshop.demo.inventory.service;

public interface InventoryService {

    void purchaseSweet(Long sweetId, int quantity);
    void restockSweet(Long sweetId, int quantity);
}
