package com.mamastep.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class SensorData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double pressureLeft;
    private double pressureRight;
    private double tiltAngle;
    private LocalDateTime timestamp;

    public Long getId() {
        return id;
    }

    public double getPressureLeft() {
        return pressureLeft;
    }

    public void setPressureLeft(double pressureLeft) {
        this.pressureLeft = pressureLeft;
    }

    public double getPressureRight() {
        return pressureRight;
    }

    public void setPressureRight(double pressureRight) {
        this.pressureRight = pressureRight;
    }

    public double getTiltAngle() {
        return tiltAngle;
    }

    public void setTiltAngle(double tiltAngle) {
        this.tiltAngle = tiltAngle;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}