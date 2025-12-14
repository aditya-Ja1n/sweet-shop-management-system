package com.sweetshop.demo.sweets.repository;

import com.sweetshop.demo.sweets.model.Sweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SweetRepository extends JpaRepository<Sweet, Long> {

}
