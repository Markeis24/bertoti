package org.bertoti.coffeapi.controller;

import org.bertoti.coffeapi.model.Coffee;
import org.bertoti.coffeapi.repository.CoffeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffees")
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

    // GET por id
    @GetMapping("/{id}")
    public Coffee getById(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }

    // POST
    @PostMapping
    public Coffee create(@RequestBody Coffee coffee) {
        return repository.save(coffee);
    }

    // PUT
    @PutMapping("/{id}")
    public Coffee update(@PathVariable String id, @RequestBody Coffee coffee) {
        coffee.setId(id);
        return repository.save(coffee);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }
}