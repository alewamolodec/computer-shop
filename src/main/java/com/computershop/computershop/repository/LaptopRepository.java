package com.computershop.computershop.repository;

import com.computershop.computershop.model.entity.Laptop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends CrudRepository<Laptop, Long> {
    List<Laptop> findAll();
}
