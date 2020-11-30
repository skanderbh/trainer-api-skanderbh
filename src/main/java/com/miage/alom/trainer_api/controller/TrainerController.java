package com.miage.alom.trainer_api.controller;

import com.miage.alom.trainer_api.bo.Trainer;
import com.miage.alom.trainer_api.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

    private final TrainerService trainerService;

    @Autowired
    TrainerController(TrainerService trainerService){
        this.trainerService = trainerService;
    }

    @GetMapping("/")
    Iterable<Trainer> getAllTrainers(){
        return this.trainerService.getAllTrainers();
    }

    @GetMapping("/{name}")
    Trainer getTrainer(@PathVariable String name){
        return this.trainerService.getTrainer(name);
    }

    @PostMapping("/")
    Trainer postTrainer(@RequestBody Trainer trainer){
        return this.trainerService.createTrainer(trainer);
    }

    @DeleteMapping("/{name}")
    String deleteTrainer(@PathVariable String name){
        this.trainerService.deleteTrainer(name);
        return "You juste deleted the trainer " + name;
    }


}
