package com.vilelapinheiro.uri2611.dto;

import com.vilelapinheiro.uri2611.projections.MovieMinProjection;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieMinDTO {
    private Long id;
    private String name;

    public MovieMinDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public MovieMinDTO(MovieMinProjection projection) {
        this.id = projection.getId();
        this.name = projection.getName();
    }
}
