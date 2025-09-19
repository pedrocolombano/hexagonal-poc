package br.com.colombano.hexagonalpoc.infrastructure.config.adapter.out.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarotCardResponse {

    private String type;
    private String name;

    @JsonAlias("desc")
    private String description;

}
