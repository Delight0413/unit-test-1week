package me.blog.eyeappeal516.controller;

import me.blog.eyeappeal516.domain.Dog;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DogController {

    private List<Dog> dogList = new ArrayList<>();

    @PostMapping("/dogs")   // http://localhost:8080/dogs
    public void insertDog(@RequestBody Dog dog) {
        dogList.add(dog);
    }

//    @GetMapping("/dogs")
//    public List<Dog> findAllDogs() {
//        return dogList;
//    }
//
//    @GetMapping("/dogs")    // http://localhost:8080/dogs/ian   // @RequestParam ; http://localhost:8080/dogs?name=ian
//    public Dog findDogs(@PathVariable String name) {
//        for (int i = 0; i < dogList.size(); i++) {
//            if (dogList.get(i).getName().equals(name)) {
//                return dogList.get(i);
//            }
//        } return null;
//    }
}
