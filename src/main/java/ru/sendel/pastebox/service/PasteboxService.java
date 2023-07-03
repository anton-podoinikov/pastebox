package ru.sendel.pastebox.service;


import ru.sendel.pastebox.api.request.PasteboxRequest;
import ru.sendel.pastebox.api.response.PasteboxResponse;
import ru.sendel.pastebox.api.response.PasteboxUrlResponse;

import java.util.List;

public interface PasteboxService {
    PasteboxResponse getByHash(String hash);
    List<PasteboxResponse> getFirstPublicPasteboxes();
    PasteboxUrlResponse create(PasteboxRequest request);
}
