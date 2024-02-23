package com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.init;

import com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Service.GasStationService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GasStationInitializer {
    private final GasStationService gasStationService;

    @Autowired
    public GasStationInitializer(GasStationService gasStationService) {
        this.gasStationService = gasStationService;
    }

    @PostConstruct
    public void init() {
        String apiUrl = "https://wejago.de/assets/data/gas-stations-data.json";
        this.gasStationService.fetchAndSaveGasStations(apiUrl);
    }
}