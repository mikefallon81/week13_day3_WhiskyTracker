package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    List<Whisky> findWhiskyFromDistilleryOfSpecificAge(Long distilleryId, int age);

    List<Whisky> findWhiskiesFromSpecificRegion(String region);

}
