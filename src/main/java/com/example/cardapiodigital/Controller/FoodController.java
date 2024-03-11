package com.example.cardapiodigital.Controller;

import com.example.cardapiodigital.DTO.FoodRequestDTO;
import com.example.cardapiodigital.DTO.FoodResponseDTO;
import com.example.cardapiodigital.Entity.Food;
import com.example.cardapiodigital.Repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {
    @Autowired
    private FoodRepository foodRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        foodRepository.save(foodData);
        return;
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")

    @GetMapping
    public List<FoodResponseDTO> getAll(){
            List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();

            return foodList;
    }
}
