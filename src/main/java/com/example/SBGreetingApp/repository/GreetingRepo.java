package com.example.SBGreetingApp.repository;

import com.example.SBGreetingApp.Model.GreetingUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepo extends JpaRepository<GreetingUser, Long> {

}
