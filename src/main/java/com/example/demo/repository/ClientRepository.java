package com.example.demo.repository;

import com.example.demo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    @Query(value = "SELECT AVG(age) from Client")
    public Double getAgeAverage();

    @Query(value = "SELECT STDDEV(age) FROM Client")
    public Double getStd();
}
