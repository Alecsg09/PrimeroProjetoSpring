package com.myfirstproject.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.myfirstproject.myfirstproject.entities.Category;

@Component
public class CategoryRepository {

    private Map<Long, Category> map = new HashMap<>();

    public void save(Category obj){
        map.put(obj.getId(), obj);

    }
    
    public Category findbyId(Long id){
        return map.get(id);

    }

    public List<Category> findAll(){
        return new ArrayList<Category>(map.values());
        
    }
}
