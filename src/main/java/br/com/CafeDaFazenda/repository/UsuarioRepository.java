package br.com.CafeDaFazenda.repository;

import br.com.CafeDaFazenda.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {

}
