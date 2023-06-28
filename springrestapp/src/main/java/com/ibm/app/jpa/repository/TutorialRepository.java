package com.ibm.app.jpa.repository;

import com.ibm.app.jpa.enity.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//This repository provides all basic operations but if you want extra api also you can add.
public interface TutorialRepository extends JpaRepository<Tutorial,Long> {
    //Extra apis
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);
}
