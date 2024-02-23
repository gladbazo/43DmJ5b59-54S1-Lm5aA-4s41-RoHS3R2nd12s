package com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Controller;

import com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Entity.FuelPriceStats;
import com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Entity.GasStation;
import com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Repository.GasStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gas-stations")
public class GasStationController {

    @Autowired
    private GasStationRepository gasStationRepository;

    @GetMapping("/open")
    public List<GasStation> getOpenGasStations() {
        return gasStationRepository.findByIsOpenTrue();
    }

    @GetMapping("/{name}")
    public List<GasStation> getGasStationByName(@PathVariable String name) {
        return gasStationRepository.findByName(name);
    }

    @GetMapping("/prices/{fuelType}")
    public FuelPriceStats getPriceStats(@PathVariable String fuelType) {
        List<BigDecimal> prices = gasStationRepository.findByIsOpenTrue().stream()
                .map(gasStation -> {
                    return switch (fuelType.toLowerCase()) {
                        case "diesel" -> gasStation.getDiesel();
                        case "e5" -> gasStation.getE5();
                        case "e10" -> gasStation.getE10();
                        default -> throw new IllegalArgumentException("Invalid fuel type");
                    };
                })
                .filter(Objects::nonNull) // Filter out null prices
                .collect(Collectors.toList());

        BigDecimal medianPrice = calculateMedian(prices);
        BigDecimal maxPrice = prices.stream().max(BigDecimal::compareTo).orElse(BigDecimal.ZERO);
        BigDecimal minPrice = prices.stream().min(BigDecimal::compareTo).orElse(BigDecimal.ZERO);

        return new FuelPriceStats(medianPrice, maxPrice, minPrice);
    }


    static BigDecimal calculateMedian(List<BigDecimal> prices) {
        int size = prices.size();
        if (size % 2 == 0) {
            int midIndex = size / 2;
            return prices.get(midIndex - 1).add(prices.get(midIndex)).divide(BigDecimal.valueOf(2));
        } else {
            return prices.get(size / 2);
        }
    }
}

