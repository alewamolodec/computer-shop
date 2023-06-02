package com.computershop.computershop.repository;

import com.computershop.computershop.model.entity.Monitor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonitorRepository extends CrudRepository<Monitor, Long> {
    List<Monitor> findAll();
}
