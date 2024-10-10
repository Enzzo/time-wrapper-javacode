package ru.javacode;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class TimeWrapper {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy:MM:dd##:HH:mm:ss:SSS", locale = "ru-RU")
    private LocalDateTime dateTime;

    public TimeWrapper(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}