package com.sweetshop.demo.inventory.service;

import com.sweetshop.demo.exception.BadRequestException;
import com.sweetshop.demo.exception.ResourceNotFoundException;
import com.sweetshop.demo.sweets.model.Sweet;
import com.sweetshop.demo.sweets.repository.SweetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final SweetRepository sweetRepository;

    @Override
    public void purchaseSweet(Long sweetId, int quantity) {
        Sweet sweet = sweetRepository.findById(sweetId).
                orElseThrow(() -> new ResourceNotFoundException("Sweet Not Found"));

        if(sweet.getQuantity() < quantity){
            throw new BadRequestException("Sweet Quantity Not Enough");
        }

        sweet.setQuantity(sweet.getQuantity() - quantity);
        sweetRepository.save(sweet);
    }

    @Override
    public void restockSweet(Long sweetId, int quantity) {
        Sweet sweet = sweetRepository.findById(sweetId).
                orElseThrow(() -> new ResourceNotFoundException("Sweet Not Found"));

        sweet.setQuantity(sweet.getQuantity() + quantity);
        sweetRepository.save(sweet);
    }
}
