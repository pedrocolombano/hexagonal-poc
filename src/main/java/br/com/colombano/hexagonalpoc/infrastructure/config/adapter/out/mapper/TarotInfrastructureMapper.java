package br.com.colombano.hexagonalpoc.infrastructure.config.adapter.out.mapper;

import br.com.colombano.hexagonalpoc.domain.model.TarotCard;
import br.com.colombano.hexagonalpoc.infrastructure.config.adapter.out.dto.TarotCardResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarotInfrastructureMapper {

    TarotCard fromDto(TarotCardResponse cardDto);

}
