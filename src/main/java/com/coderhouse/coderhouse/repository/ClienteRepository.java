package com.coderhouse.coderhouse.repository;

import com.coderhouse.coderhouse.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//SIMPLEMENTE VA ESTO
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{


}
