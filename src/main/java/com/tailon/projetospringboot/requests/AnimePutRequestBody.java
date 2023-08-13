package com.tailon.projetospringboot.requests;

import lombok.Data;

/**
 * Funciona como uma classe DTO
 **/

@Data
public class AnimePutRequestBody {
    private Long id;
    private String name;
}
