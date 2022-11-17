package br.com.wainer.objectmapper.services

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class MapperService {

    fun formatDate(textDate: String): LocalDateTime {

        val mapper = ObjectMapper().registerKotlinModule()

//        val mapperDate = mapper.readValue(textDate, LocalDateTime::class.java)
        val localDateTimeMapper = LocalDateTime.parse(textDate)

        println("String convertida para: $localDateTimeMapper")

        return localDateTimeMapper
    }
}