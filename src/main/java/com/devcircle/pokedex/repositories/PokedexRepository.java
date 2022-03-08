package com.devcircle.pokedex.repositories;

import com.devcircle.pokedex.document.Pokedex;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository<Pokedex, String> {
}
