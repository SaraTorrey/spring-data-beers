package com.example.demo.beer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
interface BeerRepository extends JpaRepository<Beer, Long> {

    List<Beer> findBeerByName( String name );
    List<Beer> findBeerByStateContainingIgnoreCase( String state );
    List<Beer> findBeerByIsGreat( Boolean isGreat );

}