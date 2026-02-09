package com.mamastep.service;

import org.springframework.stereotype.Service;

@Service
public class BalanceAnalyzer {

    private static final double THRESHOLD = 10.0;

    public boolean isImbalanced(double tiltAngle) {
        return Math.abs(tiltAngle) > THRESHOLD;
    }
}