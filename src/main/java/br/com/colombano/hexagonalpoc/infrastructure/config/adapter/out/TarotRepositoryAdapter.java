package br.com.colombano.hexagonalpoc.infrastructure.config.adapter.out;

import br.com.colombano.hexagonalpoc.domain.model.TarotCard;
import br.com.colombano.hexagonalpoc.domain.port.out.TarotRepositoryPort;
import br.com.colombano.hexagonalpoc.infrastructure.config.adapter.out.dto.TarotResponse;
import br.com.colombano.hexagonalpoc.infrastructure.config.adapter.out.mapper.TarotInfrastructureMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TarotRepositoryAdapter implements TarotRepositoryPort {

    private final WebClient tarotClient;
    private final TarotInfrastructureMapper mapper;

    @Override
    public Flux<TarotCard> getCards() {
        return tarotClient.get()
                          .uri("/cards")
                          .retrieve()
                          .bodyToMono(TarotResponse.class)
                          .flatMapMany(t -> Flux.fromIterable(t.getCards()))
                          .map(mapper::fromDto);
    }

    @Override
    public Mono<TarotCard> getRandomCard() {
        return tarotClient.get()
                          .uri("/cards/random?n=1")
                          .retrieve()
                          .bodyToMono(TarotResponse.class)
                          .flatMap(t -> Flux.fromIterable(t.getCards())
                                                         .next())
                          .map(mapper::fromDto);
    }
}
