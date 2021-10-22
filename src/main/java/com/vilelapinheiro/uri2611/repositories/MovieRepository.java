package com.vilelapinheiro.uri2611.repositories;

import com.vilelapinheiro.uri2611.entities.Movie;
import com.vilelapinheiro.uri2611.projections.MovieMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Query(nativeQuery = true, value="select movies.id, movies.name from movies inner join genres on movies.id_genres = genres.id where upper(genres.description) = upper(:movieName)")
    List<MovieMinProjection> search1(String movieName);

    @Query(value="select new com.vilelapinheiro.uri2611.dto.MovieMinDTO(obj.id, obj.name) from Movie obj "
            + "where upper(obj.genre.description) = upper(:movieName)")
    List<MovieMinProjection> search2(String movieName);
}
