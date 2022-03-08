package com.devcircle.pokedex.services;

import com.devcircle.pokedex.document.Pokedex;
import com.devcircle.pokedex.repositories.PokedexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PokedexServiceImplem implements PokedexService{

    @Autowired
    PokedexRepository pr;

    @Override
    public Flux<Pokedex> findAll() {
        return pr.findAll();
    }

    @Override
    public Mono<Pokedex> findById(String Id) {
        return pr.findById(Id);
    }

    @Override
    public Mono<Pokedex> save(Pokedex pokedex) {
        return pr.save(pokedex);
    }
}
