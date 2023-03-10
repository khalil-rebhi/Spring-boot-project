package tn.esprit.firstproject.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfing {

    @Bean
    public OpenAPI springShopOpenApi(){
        return new OpenAPI()
                .info(infoApi());
    }

    public Info infoApi(){
        return new Info().title("SKieur project")
                .description("TP etude de cas")
                .contact(contactAPI());
    }

    public Contact contactAPI(){
        return new Contact().name("Khalil rebhi")
                .email("khalil.rebhi@esprit.tn")
                .url("");
    }

   /*@Bean
    public GroupedOpenApi productPublicApi(){
        return GroupedOpenApi.builder()
                .group("Only piste management API")
                .pathsToMatch("/piste")
                .pathsToExclude("**")
                .build();
    }*/
}
