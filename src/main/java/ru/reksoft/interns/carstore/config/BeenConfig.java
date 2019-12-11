package ru.reksoft.interns.carstore.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.reksoft.interns.carstore.dto.*;
import ru.reksoft.interns.carstore.entity.Model;
import ru.reksoft.interns.carstore.entity.Users;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static org.modelmapper.config.Configuration.AccessLevel.PRIVATE;

@Configuration
public class BeenConfig {

//    @Bean(name="helloBean")
//    public ModelMapper modelMapper() {
//        return new ModelMapper();
//    }


        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build();
        }


    @Bean
    public DictCarcassDto dictCarcassDto() {
        return new DictCarcassDto();
    }

    @Bean
    public ColorDTO colorDTO() {
        return new ColorDTO();
    }

    @Bean
    public DictOrderStatusDto dictOrderStatusDto() {
        return new DictOrderStatusDto();
    }

    @Bean
    public ModelDto modelDto() {
        return new ModelDto();
    }

    @Bean
    public EngineDto engineDto() {
        return new EngineDto();
    }

    @Bean
    public AutoInStockDto autoInStockDto() {
        return new AutoInStockDto();
    }

    @Bean
    public UsersDto usersDto() {
        return new UsersDto();
    }

    @Bean
    public OrdersDto ordersDto() {
        return new OrdersDto();
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();
//        mapper.getConfiguration()
//                .setMatchingStrategy(MatchingStrategies.STRICT)
//                .setFieldMatchingEnabled(true)
//                .setSkipNullEnabled(true)
//                .setFieldAccessLevel(PRIVATE);
        return mapper;
    }

}
