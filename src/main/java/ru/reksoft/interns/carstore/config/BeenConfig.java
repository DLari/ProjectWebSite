package ru.reksoft.interns.carstore.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.reksoft.interns.carstore.dto.ColorDTO;

import static org.modelmapper.config.Configuration.AccessLevel.PRIVATE;

@Configuration
public class BeenConfig {

//    @Bean(name="helloBean")
//    public ModelMapper modelMapper() {
//        return new ModelMapper();
//    }


    @Bean
    public ColorDTO colorDTO() {
        return new ColorDTO();
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setFieldMatchingEnabled(true)
                .setSkipNullEnabled(true)
                .setFieldAccessLevel(PRIVATE);
        return mapper;
    }

}
