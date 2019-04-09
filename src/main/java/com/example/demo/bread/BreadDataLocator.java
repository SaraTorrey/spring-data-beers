package com.example.demo.bread;

import org.springframework.stereotype.Component;

@Component
public class BreadDataLocator {

    BreadRepository repository;

    public void localBreadTestData () throws Exception {

        Bread bread = new Bread(  );
        bread.setName( "Baguette" );
        bread.setCountry( "France" );
        bread.setIsDelicious( true);
        repository.save( bread );

        repository.save( new Bread( "Hot Dog Bun", false, "America" ) );
        repository.save( new Bread( "Chiabatta", true, "Italy" ) );
        repository.save( new Bread( "Pita", true, "Lebenan" ) );
        repository.save( new Bread( "Sangak", true, "Iran" ) );
        repository.save( new Bread( "Hamburger Bun", false, "America" ) );

        repository.findAll().forEach( System.out:: println );
    }

}