package com.miage.alom.trainer_api.repository;

import com.miage.alom.trainer_api.bo.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TrainerRepository extends CrudRepository<Trainer, String> {

    Trainer save(Trainer trainer);
    Optional<Trainer> findById(String name);
    Iterable<Trainer> findAll();
    @Override
    void deleteById(String name);
}
