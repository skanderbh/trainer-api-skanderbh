package com.miage.alom.trainer_api.service;

import com.miage.alom.trainer_api.bo.Trainer;
import com.miage.alom.trainer_api.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainerServiceImpl implements TrainerService {

    private TrainerRepository trainerRepository;

    @Autowired
    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public Iterable<Trainer> getAllTrainers() {
       return  this.trainerRepository.findAll();
    }

    @Override
    public Trainer getTrainer(String name) {
        return this.trainerRepository.findById(name).orElse(null);
    }

    @Override
    public Trainer createTrainer(Trainer trainer) {
        return this.trainerRepository.save(trainer);
    }

    @Override
    public void deleteTrainer(String name) {
        this.trainerRepository.deleteById(name);
    }
}