package br.com.CafeDaFazenda.repository;

import br.com.CafeDaFazenda.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedidos, Integer> {

}
