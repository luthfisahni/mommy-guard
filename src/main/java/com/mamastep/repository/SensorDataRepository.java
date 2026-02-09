package com.mamastep.repository;

import com.mamastep.entity.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorDataRepository
        extends JpaRepository<SensorData, Long> {
}
