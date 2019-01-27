package com.greenfox.mysqlconnection.repository;

import com.greenfox.mysqlconnection.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
