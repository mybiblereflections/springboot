package com.simeon.h2demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simeon.h2demo.models.TODO;

@Repository
public interface TODORepository extends CrudRepository<TODO, Integer>{

}
