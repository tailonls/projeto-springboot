package com.tailon.projetospringboot.service;

import com.tailon.projetospringboot.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service: Classe responsavel pela lógica de negócio
 **/

@Service
public class AnimeService {

    public List<Anime> listAll() {
        return List.of(new Anime(1L, "DBZ"), new Anime(2L, "Berserk"));
    }

}
