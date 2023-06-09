package com.tailon.projetospringboot.service;

import com.tailon.projetospringboot.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Service: Classe responsavel pela lógica de negócio
 **/

@Service
public class AnimeService {

    private static List<Anime> animeList;

    static {
        animeList = new ArrayList<>(List.of(new Anime(1L, "DBZ"), new Anime(2L, "Berserk")));
    }

    public List<Anime> listAll() {
        return animeList;
    }

    public Anime getById(Long id) {
        return animeList.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found"));
    }

    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(3, 100));
        animeList.add(anime);
        return anime;
    }

    public void delete(Long id) {
        animeList.remove(getById(id));
    }

    public void replace(Anime anime) {
        delete(anime.getId());
        animeList.add(anime);
    }
}
