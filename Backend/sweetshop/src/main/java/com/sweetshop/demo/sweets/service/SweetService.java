package com.sweetshop.demo.sweets.service;

import com.sweetshop.demo.sweets.model.Sweet;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SweetService {
    Sweet addSweet(Sweet sweet);
    List<Sweet> getAllSweets();
    List<Sweet> searchSweets(String name, String category, Double minPrice, Double maxPrice);
    Sweet updateSweet(Long id, Sweet sweet);
    void deleteSweet(Long id);
}
