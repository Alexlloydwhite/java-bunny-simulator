package com.bunny.simulator.repository;

import com.bunny.simulator.domain.Bunny;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BunnyColonyRepository extends CrudRepository<Bunny, UUID> {
}
