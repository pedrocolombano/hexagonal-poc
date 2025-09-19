package br.com.colombano.hexagonalpoc.infrastructure.config.adapter.out.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class TarotResponse {

    private final List<TarotCardResponse> cards = new ArrayList<>();

}
