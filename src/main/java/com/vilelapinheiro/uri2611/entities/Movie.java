package com.vilelapinheiro.uri2611.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="movies")
@Getter @Setter
@NoArgsConstructor
public class Movie {
    @Id
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "id_genres")
    private Genre genre;
}
