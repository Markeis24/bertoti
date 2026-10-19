package org.bertoti.coffeapi.repository;

import org.bertoti.coffeapi.model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository extends JpaRepository<Coffee, String> {
}