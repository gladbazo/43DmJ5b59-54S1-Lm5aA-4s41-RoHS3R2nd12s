package com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Service;

import com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Entity.GasStation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
public class GasStationResponse {
    private List<GasStation> stations;

    public GasStationResponse() {
    }

    public List<GasStation> getStations() {
        return this.stations;
    }

    public void setStations(List<GasStation> stations) {
        this.stations = stations;
    }

    public String toString() {
        return "GasStationResponse{stations=" + String.valueOf(this.stations) + "}";
    }
}
