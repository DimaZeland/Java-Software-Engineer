package com.spring.FirstRestApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.FirstRestApp.models.Person;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
