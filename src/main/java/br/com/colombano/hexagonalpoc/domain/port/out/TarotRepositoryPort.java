package br.com.colombano.hexagonalpoc.domain.port.out;

import br.com.colombano.hexagonalpoc.domain.model.TarotCard;
import reactor.core.publisher.Flux;

public interface TarotRepositoryPort {

    Flux<TarotCard> getCards();

}
