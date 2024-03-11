package com.example.cardapiodigital.Repository;

import com.example.cardapiodigital.Entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
