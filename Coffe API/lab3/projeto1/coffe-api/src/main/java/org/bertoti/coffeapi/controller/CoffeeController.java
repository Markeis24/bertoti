package org.bertoti.coffeapi.controller;

import org.bertoti.coffeapi.model.Coffee;
import org.bertoti.coffeapi.repository.CoffeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffees")
@CrossOrigin("*")
public class CoffeeController {

    private final CoffeeRepository repository;

    public CoffeeController(CoffeeRepository repository) {
        this.repository = repository;
    }

    // GET - listar todos
    @GetMapping
    public List<Coffee> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Coffee getById(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }

    @PostMapping
    public Coffee create(@RequestBody Coffee coffee) {
        return repository.save(coffee);
    }

    @PutMapping("/{id}")
    public Coffee update(@PathVariable String id, @RequestBody Coffee coffee) {
        coffee.setId(id);
        return repository.save(coffee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}