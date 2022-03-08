package com.devcircle.pokedex.services;

import com.devcircle.pokedex.document.Pokedex;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PokedexService {

    Flux<Pokedex> findAll();
    Mono<Pokedex> findById(String Id);
    Mono<Pokedex> save(Pokedex pokedex);
}
