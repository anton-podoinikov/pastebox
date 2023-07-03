package ru.sendel.pastebox.api.request;

import lombok.Data;

@Data
public class PasteboxRequest {
    private String data;
    private long expirationTimeSeconds;
    private PublicStatus publicStatus;

}
