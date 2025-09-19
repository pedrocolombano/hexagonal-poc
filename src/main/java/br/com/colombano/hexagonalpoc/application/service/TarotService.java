package br.com.colombano.hexagonalpoc.application.service;

import br.com.colombano.hexagonalpoc.domain.model.TarotCard;
import br.com.colombano.hexagonalpoc.domain.port.out.TarotRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TarotService {

    private final TarotRepositoryPort tarotRepositoryPort;

    public Flux<TarotCard> getCards() {
        return tarotRepositoryPort.getCards();
    }

    public Mono<TarotCard> getRandomCard() {
        return tarotRepositoryPort.getRandomCard();
    }

}
