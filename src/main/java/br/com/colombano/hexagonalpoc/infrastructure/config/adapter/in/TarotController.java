package br.com.colombano.hexagonalpoc.infrastructure.config.adapter.in;

import br.com.colombano.hexagonalpoc.application.service.TarotService;
import br.com.colombano.hexagonalpoc.domain.model.TarotCard;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tarot")
public class TarotController {

    private final TarotService tarotService;

    @GetMapping
    public Flux<TarotCard> getCards() {
        return tarotService.getCards();
    }

}
