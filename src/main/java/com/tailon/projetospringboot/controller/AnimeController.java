package com.tailon.projetospringboot.controller;

import com.tailon.projetospringboot.domain.Anime;
import com.tailon.projetospringboot.service.AnimeService;
import com.tailon.projetospringboot.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Controller: camada intermediária entre a camada de apresentação (View) e a camada de negócios (Model).
 * Responsável por receber todas as requisições do usuário.
 * Seus métodos (actions) são responsáveis por uma página, controlando qual model usar e qual view
 * será mostrado ao usuário.
 * <p>
 * Adicionando o spring devtools no pom automaticamente adicionamos o Hot Swap,
 * assim quando fizermos alterações pequenas em uma classe, o build é mais rápido.
 */

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<Anime>> ListAnime() {
        log.info(dateUtil.formatLocalDateTimeToToDataBaseStile(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.listAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime> getAnimeById(@PathVariable Long id) {
        log.info(dateUtil.formatLocalDateTimeToToDataBaseStile(LocalDateTime.now()));
        return ResponseEntity.ok(animeService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Anime> save(@RequestBody Anime anime) {
        log.info(dateUtil.formatLocalDateTimeToToDataBaseStile(LocalDateTime.now()));
        return new ResponseEntity<>(animeService.save(anime), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        log.info(dateUtil.formatLocalDateTimeToToDataBaseStile(LocalDateTime.now()));
        animeService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping()
    public ResponseEntity<Void> replace(@RequestBody Anime anime) {
        log.info(dateUtil.formatLocalDateTimeToToDataBaseStile(LocalDateTime.now()));
        animeService.replace(anime);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
