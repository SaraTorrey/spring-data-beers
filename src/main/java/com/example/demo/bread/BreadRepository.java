package com.example.demo.bread;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface BreadRepository extends JpaRepository<Bread, Long> {

    List<Bread> findBreadByName

}