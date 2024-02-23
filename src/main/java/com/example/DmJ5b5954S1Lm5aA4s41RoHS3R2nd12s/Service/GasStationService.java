package com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Service;

import com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Entity.GasStation;
import com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Repository.GasStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;

@Service
public class GasStationService {
    private final RestTemplate restTemplate;
    private final GasStationRepository gasStationRepository;

    @Autowired
    public GasStationService(RestTemplate restTemplate, GasStationRepository gasStationRepository) {
        this.restTemplate = restTemplate;
        this.gasStationRepository = gasStationRepository;
    }

    public void fetchAndSaveGasStations(String apiUrl) {
        GasStationResponse response = (GasStationResponse)this.restTemplate.getForObject(apiUrl, GasStationResponse.class, new Object[0]);
        if (response != null && response.getStations() != null) {
            Iterator var3 = response.getStations().iterator();

            while(var3.hasNext()) {
                GasStation gasStation = (GasStation)var3.next();
                if (gasStation.isOpen()) {
                    this.gasStationRepository.save(gasStation);
                }
            }
        }

    }
}
