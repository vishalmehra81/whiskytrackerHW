package com.codeclan.example.WhiskyTracker.repositories;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.Year;
import java.util.List;

@Repository
public interface WhiskyRepository extends JpaRepository<Whisky, Long> {

    List<Whisky>getAllWhiskiesFromAYearEqualsTo(Integer Year);

    List<Whisky>getWhiskeyFromADistilleryEqualsToWithAgeEqualsTo(Integer name, Integer age);


}
