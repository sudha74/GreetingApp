package com.bl.greetingappdevlopment.Repository;

import com.bl.greetingappdevlopment.Entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGreetingRepository extends JpaRepository<Greeting,Long> {

}