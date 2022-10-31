package com.example.demo.repo;

import com.example.demo.Model.User;
import org.hibernate.mapping.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<User,Long> {

}
