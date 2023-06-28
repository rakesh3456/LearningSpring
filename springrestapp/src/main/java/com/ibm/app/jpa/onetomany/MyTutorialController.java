package com.ibm.app.jpa.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyTutorialController {

    @Autowired
    MyTutorialRepository tutorialRepository;

    @Autowired
    private TutorialDetailsRepository detailsRepository;

    @GetMapping("/mytutorials")
    public ResponseEntity<List<MyTutorial>> getAllTutorials(@RequestParam(required = false) String title) {
        List<MyTutorial> tutorials = new ArrayList<MyTutorial>();

        if (title == null)
            tutorialRepository.findAll().forEach(tutorials::add);
        else
            tutorialRepository.findByTitleContaining(title).forEach(tutorials::add);

        if (tutorials.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }

    @GetMapping("/mytutorials/{id}")
    public ResponseEntity<MyTutorial> getTutorialById(@PathVariable("id") long id) {
        MyTutorial tutorial = tutorialRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

        return new ResponseEntity<>(tutorial, HttpStatus.OK);
    }

    @PostMapping("/mytutorials")
    public ResponseEntity<MyTutorial> createTutorial(@RequestBody MyTutorial tutorial) {
        MyTutorial _tutorial = tutorialRepository.save(new MyTutorial(tutorial.getTitle(), tutorial.getDescription(), true));
        return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
    }

    @PutMapping("/mytutorials/{id}")
    public ResponseEntity<MyTutorial> updateTutorial(@PathVariable("id") long id, @RequestBody MyTutorial tutorial) {
        MyTutorial _tutorial = tutorialRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found Tutorial with id = " + id));

        _tutorial.setTitle(tutorial.getTitle());
        _tutorial.setDescription(tutorial.getDescription());
        _tutorial.setPublished(tutorial.isPublished());

        return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
    }

    @DeleteMapping("/mytutorials/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
        if (detailsRepository.existsById(id)) {
            detailsRepository.deleteById(id);
        }

        tutorialRepository.deleteById(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/mytutorials")
    public ResponseEntity<HttpStatus> deleteAllTutorials() {
        tutorialRepository.deleteAll();

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/mytutorials/published")
    public ResponseEntity<List<MyTutorial>> findByPublished() {
        List<MyTutorial> tutorials = tutorialRepository.findByPublished(true);

        if (tutorials.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(tutorials, HttpStatus.OK);
    }
}