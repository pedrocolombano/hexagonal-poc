package br.com.colombano.hexagonalpoc.application.mapper;

import br.com.colombano.hexagonalpoc.application.dto.TarotCardDetailDto;
import br.com.colombano.hexagonalpoc.application.dto.TarotCardDto;
import br.com.colombano.hexagonalpoc.domain.model.TarotCard;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarotApplicationMapper {

    TarotCardDto fromDomain(TarotCard card);
    TarotCardDetailDto fromDomainDetail(TarotCard card);

}
