package br.com.colombano.hexagonalpoc.infrastructure.config.adapter.out;

import br.com.colombano.hexagonalpoc.domain.model.Tarot;
import br.com.colombano.hexagonalpoc.domain.model.TarotCard;
import br.com.colombano.hexagonalpoc.domain.port.out.TarotRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class TarotRepositoryAdapter implements TarotRepositoryPort {

    private final WebClient tarotClient;

    @Override
    public Flux<TarotCard> getCards() {
        return tarotClient.get()
                          .uri("/cards")
                          .retrieve()
                          .bodyToMono(Tarot.class)
                          .flatMapMany(t -> Flux.fromIterable(t.getCards()));
    }
}
