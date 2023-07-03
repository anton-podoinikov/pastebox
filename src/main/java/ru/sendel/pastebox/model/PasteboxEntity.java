package ru.sendel.pastebox.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PasteboxEntity {
    private int id;
    private String data;
    private String hash;
    private LocalDateTime lifetime;
    private boolean isPublic;
}
