package br.com.CafeDaFazenda.repository;

import br.com.CafeDaFazenda.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}