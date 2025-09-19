package br.com.colombano.hexagonalpoc.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Tarot {

    private final List<TarotCard> cards = new ArrayList<>();

}
