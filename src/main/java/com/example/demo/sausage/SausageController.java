package com.example.demo.sausage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class SausageController {


    private SausageRepository repository;

    @Autowired
    public SausageController( SausageRepository repository ) {

        this.repository = repository;
    }

    @GetMapping(value = "/allSausages", produces = "application/json")
    Collection<Sausage> list() {

        return repository.findAll();

    }



    @PostMapping( value = "/addSausage/{nameOfSausage}/{city}/{isDelicious}", produces = "application/json")
    Sausage addSausage( @PathVariable String nameOfSausage, @PathVariable String city, @PathVariable boolean isDelicious ) {

        Sausage sausage = new Sausage();
        sausage.setName( nameOfSausage );
        sausage.setDelicious( isDelicious );
        sausage.setCity( city );

        return repository.save( sausage );
    }

}