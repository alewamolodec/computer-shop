package com.computershop.computershop.repository;

import com.computershop.computershop.model.entity.DesktopComputer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DesktopComputerRepository extends CrudRepository<DesktopComputer, Long> {
    List<DesktopComputer> findAll();
}
