package br.com.colombano.hexagonalpoc.domain.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarotCard {

    private String type;
    private String name;

    @JsonAlias("desc")
    private String description;

}
