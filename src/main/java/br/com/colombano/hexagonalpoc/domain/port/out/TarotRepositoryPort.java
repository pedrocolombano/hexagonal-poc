package br.com.colombano.hexagonalpoc.domain.port.out;

import br.com.colombano.hexagonalpoc.domain.model.TarotCard;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TarotRepositoryPort {

    Flux<TarotCard> getCards();
    Mono<TarotCard> getRandomCard();

}
