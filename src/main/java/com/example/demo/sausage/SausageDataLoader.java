package com.example.demo.sausage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SausageDataLoader {

    @Autowired
    SausageRepository repository;

    @PostConstruct
    public void loadSausageTestData( ) throws Exception {

        Sausage sausage = new Sausage();
        sausage.setName( "Bratwurst" );
        sausage.setDelicious( true );
        sausage.setCity( "Frankfurt" );
        repository.save( sausage );

        repository.save( new Sausage("Rostbratwurst", true, "Nurenberg") );
        repository.save( new Sausage("Currywurst", true, "Berlin") );
        repository.save( new Sausage("Frankfurters", false, "Frankfurt") );
        repository.save( new Sausage("Weisswurst", true, "Munich") );
        repository.save( new Sausage("Bockwurst", false, "Berlin") );

        repository.findAll().forEach( System.out:: println);
    }

}