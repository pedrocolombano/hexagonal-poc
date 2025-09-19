package br.com.colombano.hexagonalpoc.infrastructure.config.adapter.in;

import br.com.colombano.hexagonalpoc.application.dto.TarotCardDetailDto;
import br.com.colombano.hexagonalpoc.application.dto.TarotCardDto;
import br.com.colombano.hexagonalpoc.application.mapper.TarotApplicationMapper;
import br.com.colombano.hexagonalpoc.application.service.TarotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tarot/cards")
public class TarotController {

    private final TarotService tarotService;
    private final TarotApplicationMapper mapper;

    @GetMapping
    public Flux<TarotCardDto> getCards() {
        return tarotService.getCards()
                           .map(mapper::fromDomain);
    }

    @GetMapping("/random")
    public Mono<TarotCardDetailDto> getRandomCard() {
        return tarotService.getRandomCard()
                           .map(mapper::fromDomainDetail);
    }

}
