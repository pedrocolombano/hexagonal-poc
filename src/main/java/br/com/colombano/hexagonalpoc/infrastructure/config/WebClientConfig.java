package br.com.colombano.hexagonalpoc.infrastructure.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient tarotClient(WebClient.Builder builder,
                                  @Value("${tarot-api.url}") String baseUrl) {
        return builder.baseUrl(baseUrl)
                      .defaultHeader(HttpHeaders.ACCEPT, "application/json")
                      .defaultHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                      .build();
    }

}
