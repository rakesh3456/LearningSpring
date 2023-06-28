package com.ibm.app.resources;

import com.ibm.app.resources.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    //@GetMapping(produces = {"application/json"})
    @GetMapping
    public User findAll() {
        return new User(1, "Subramanian");
    }

    // /api/users/1
    @GetMapping(value = "/{id}")
    public String findById(@PathVariable("id") String id) {
        return id + "details";
    }

    @GetMapping(value = "/filter")
    public String filter(@RequestParam("ranking") String ranking) {
        return ranking;
    }

    //How to send list of Users
    @GetMapping("/list")
    public List<User> list() {
        return List.of(new User(1, "Subramanian"), new User(2, "Ram"));
    }

    @GetMapping("/listresponse")
    public ResponseEntity<List<User>> listResponse() {
        List<User> users = List.of(new User(1, "Subramanian"), new User(2, "Ram"));
        return ResponseEntity
                .status(HttpStatus.OK)
                .header("secrete", "foobar")
                .contentType(MediaType.APPLICATION_JSON)
                .body(users);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String save(@RequestBody User user) {
        System.out.println(user);
        return "Saved";
    }

    @GetMapping("/process")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void process() {
        System.out.println("Processed");
    }

}
