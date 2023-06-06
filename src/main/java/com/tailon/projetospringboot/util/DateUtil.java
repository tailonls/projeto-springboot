package com.tailon.projetospringboot.util;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * A anotação @Component transforma a classe em um bean.
 * Beans são instancias de classes que são gerenciadas por um Spring Ioc container
 **/


@Component
public class DateUtil {

    public String formatLocalDateTimeToToDataBaseStile(LocalDateTime localDateTime) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
    }
}
