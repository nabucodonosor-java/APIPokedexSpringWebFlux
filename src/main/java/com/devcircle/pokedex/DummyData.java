package com.devcircle.pokedex;

import com.devcircle.pokedex.document.Pokedex;
import com.devcircle.pokedex.repositories.PokedexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Component
public class DummyData  implements CommandLineRunner {

//    private final PokedexRepository pokedexRepository;
//
//    DummyData(PokedexRepository pokedexRepository) {
//
//        this.pokedexRepository = pokedexRepository;
//    }

    @Autowired
    private PokedexRepository pokedexRepository;

    @Override
    public void run(String... args) throws Exception {
        pokedexRepository.deleteAll()
                .thenMany(
                        Flux.just("Bulbasaur", "Venusaur", "Charmander" , "Charmeleon" , "Charizard" , "Squirtle", "Wartortle", "Blastoise", "Metapod")
                                .map (nome -> new Pokedex(UUID.randomUUID().toString(), nome))
                                .flatMap(pokedexRepository::save))

                .subscribe(System.out::println);
    }

}
