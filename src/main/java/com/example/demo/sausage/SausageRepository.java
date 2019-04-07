package com.example.demo.sausage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RepositoryRestResource(collectionResourceRel = "sausage-api", path = "sausage-api")
interface SausageRepository extends JpaRepository<Sausage, Long> {

    List<Sausage> findSausageByCity( String city );
    List<Sausage> findSausageByName( String name );
    List<Sausage> findSausageByNameAndCity( String name, String city );
    List<Sausage> findSausageByIsDelicious( Boolean isDelicoius );

}