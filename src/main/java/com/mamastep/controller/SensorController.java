package com.mamastep.controller;

import com.mamastep.entity.SensorData;
import com.mamastep.repository.SensorDataRepository;
import com.mamastep.service.BalanceAnalyzer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/sensor")
@CrossOrigin
public class SensorController {

    @Autowired
    private SensorDataRepository repository;

    @Autowired
    private BalanceAnalyzer analyzer;

    @PostMapping("/simulate")
    public Map<String, Object> simulateSensor() {

        SensorData data = new SensorData();
        data.setPressureLeft(Math.random() * 100);
        data.setPressureRight(Math.random() * 100);
        data.setTiltAngle(Math.random() * 30 - 15);
        data.setTimestamp(LocalDateTime.now());

        repository.save(data);

        boolean imbalance = analyzer.isImbalanced(data.getTiltAngle());

        Map<String, Object> response = new HashMap<>();
        response.put("data", data);
        response.put("imbalance", imbalance);

        return response;
    }
}
