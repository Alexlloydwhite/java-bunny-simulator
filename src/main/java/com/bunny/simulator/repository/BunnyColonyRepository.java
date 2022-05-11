package com.bunny.simulator.repository;

import com.bunny.simulator.model.BunnyColonyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BunnyColonyRepository extends JpaRepository<BunnyColonyModel, Long> {
}
