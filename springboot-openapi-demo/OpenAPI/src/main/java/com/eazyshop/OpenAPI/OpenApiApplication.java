package com.eazyshop.OpenAPI;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

@SpringBootApplication
public class OpenApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenApiApplication.class, args);
	}

	@Bean
	public OpenAPI eazyShopOpenAPI() {
		List<Tag> tags = new ArrayList<>();
		Tag tag = new Tag();
		tag.setName("Category");
		tags.add(tag);
		return new OpenAPI()
				.info(new Info().title("Eazy Shop API")
						.description("Eazy shop sample application")
						.version("v0.0.1")
						.contact(new Contact().name("Eazy Shop").email("support@eazyshop.com")
								.url("www.eazyshop.com"))
						.license(new License().name("Apache 2.0").url("http://springdoc.org")))
				.externalDocs(new ExternalDocumentation()
						.description("EazyShop Wiki Documentation")
						.url("https://eazyshop.wiki.github.org/docs"))
				.tags(tags);


	}
}
