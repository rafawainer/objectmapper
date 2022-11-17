package br.com.wainer.objectmapper.config

import com.fasterxml.jackson.databind.SerializationFeature
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder

@ComponentScan
open class DateAndTimeAutoStart {
    @Autowired
    var config: DateAndTimeConfig? = null

    @Bean
    fun configure(): Jackson2ObjectMapperBuilder {
        val builder = Jackson2ObjectMapperBuilder()
        builder.modulesToInstall(ConfigMapper(this.config!!).createModule())
        builder.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
        return builder
    }
}