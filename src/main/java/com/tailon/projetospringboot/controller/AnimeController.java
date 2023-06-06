package com.tailon.projetospringboot.controller;

import com.tailon.projetospringboot.domain.Anime;
import com.tailon.projetospringboot.service.AnimeService;
import com.tailon.projetospringboot.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Controller: camada intermediária entre a camada de apresentação (View) e a camada de negócios (Model).
 * Responsável por receber todas as requisições do usuário.
 * Seus métodos (actions) são responsáveis por uma página, controlando qual model usar e qual view
 * será mostrado ao usuário.

 * Adicionando o spring devtools no pom automaticamente adicionamos o Hot Swap,
 * assim quando fizermos alterações pequenas em uma classe, o build é mais rápido.
 */

@RestController
@RequestMapping("anime")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping(path = "list")
    public List<Anime> ListAnime() {
        log.info(dateUtil.formatLocalDateTimeToToDataBaseStile(LocalDateTime.now()));
        return animeService.listAll();
    }

}
