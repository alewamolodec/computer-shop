package com.computershop.computershop.repository;

import com.computershop.computershop.model.entity.HardDrive;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HardDriveRepository extends CrudRepository<HardDrive, Long> {
    List<HardDrive> findAll();
}
