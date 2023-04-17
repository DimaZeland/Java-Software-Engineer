package com.spring.rest_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.rest_api.models.Measurement;


@Repository
public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {
}
