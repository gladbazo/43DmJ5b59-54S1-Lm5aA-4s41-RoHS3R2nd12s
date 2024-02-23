package com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Repository;

import com.example.DmJ5b5954S1Lm5aA4s41RoHS3R2nd12s.Entity.GasStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GasStationRepository extends JpaRepository<GasStation, Long> {
    List<GasStation> findByIsOpenTrue();

    List<GasStation> findByName(String name);
}