package com.vilelapinheiro.uri2611.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="genres")
public class Genre {
    @Id
    private Long id;

    private String description;

    @OneToMany(mappedBy="genre")
    private List<Movie> movies = new ArrayList<>();
}
