package br.com.wainer.objectmapper.controller

import br.com.wainer.objectmapper.services.MapperService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class MapperController(
    private val mapperService: MapperService
) {

    @GetMapping("/mapper")
    fun getDateFormatted() : ResponseEntity<LocalDateTime> {

        val textDate = "2022-11-16T22:24:10.123Z"
        println("String a ser convertida: $textDate")

        return ResponseEntity.ok(mapperService.formatDate(textDate))
    }

}