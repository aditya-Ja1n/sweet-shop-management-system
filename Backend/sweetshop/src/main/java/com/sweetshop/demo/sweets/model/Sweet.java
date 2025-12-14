package com.sweetshop.demo.sweets.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Entity
@Table(name = "sweets")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Sweet name is required")
    private String name;

    @Column(nullable = false)
    @NotBlank(message = "Category is required")
    private String category;

    @Column(nullable = false)
    @NotBlank(message = "Price is required")
    @Positive(message = "Price should be greater than 0")
    private double price;

    @Column(nullable = false)
    @NotBlank(message = "Quantity is required")
    @Positive(message = "Quantity should be greater than 0")
    private int quantity;
}
