package com.ibm.app.jpa.onetomany;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MyTutorialRepository extends JpaRepository<MyTutorial, Long> {
    List<MyTutorial> findByPublished(boolean published);

    List<MyTutorial> findByTitleContaining(String title);
}
