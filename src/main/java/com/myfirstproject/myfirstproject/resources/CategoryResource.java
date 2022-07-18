package com.myfirstproject.myfirstproject.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myfirstproject.myfirstproject.entities.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {


    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        List<Category> list = new ArrayList<>();
        list.add(new Category(1L, "Electronics"));
        list.add(new Category(2L,"Books"));
        list.add(new Category(3L, "Games"));
        return ResponseEntity.ok().body(list);

    }
  /*  
    @GetMapping(value = "/{id}")
    public ResponseEntity<...> findbyId(@PathVariable Long id){
        ...
        return ResponseEntity.ok().body(...);
    }
*/
}
