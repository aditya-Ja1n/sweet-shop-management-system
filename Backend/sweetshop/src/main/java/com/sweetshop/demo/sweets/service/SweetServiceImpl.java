package com.sweetshop.demo.sweets.service;

import com.sweetshop.demo.exception.ResourceNotFoundException;
import com.sweetshop.demo.sweets.model.Sweet;
import com.sweetshop.demo.sweets.repository.SweetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SweetServiceImpl implements SweetService{

    private final SweetRepository sweetRepository;

    @Override
    public Sweet addSweet(Sweet sweet) {
        return sweetRepository.save(sweet);
    }

    @Override
    public List<Sweet> getAllSweets() {
        return sweetRepository.findAll();
    }

    @Override
    public List<Sweet> searchSweets(String name, String category, Double minPrice, Double maxPrice) {
        return sweetRepository.findAll().stream()
                .filter(s -> name == null || s.getName().toLowerCase().contains(name.toLowerCase()))
                .filter(s-> category == null || s.getCategory().equalsIgnoreCase(category))
                .filter(s -> minPrice == null || s.getPrice() >= minPrice)
                .filter(s -> maxPrice == null || s.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    @Override
    public Sweet updateSweet(Long id, Sweet updated) {
        Sweet sweet = sweetRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Sweet not found"));

        sweet.setName(updated.getName());
        sweet.setCategory(updated.getCategory());
        sweet.setPrice(updated.getPrice());
        sweet.setQuantity(updated.getQuantity());

        return sweetRepository.save(sweet);
    }

    @Override
    public void deleteSweet(Long id) {
        sweetRepository.deleteById(id);
    }
}
