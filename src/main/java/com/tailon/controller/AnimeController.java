package com.tailon.controller;

import com.tailon.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {

    //@RequestMapping(method = RequestMethod.GET, path = "list") // Se por no controller não precisa por aqui
    @GetMapping(path = "list")
    public List<Anime> ListAnime() {
        return List.of(new Anime("DBZ"), new Anime("Berserk"));
    }

}
