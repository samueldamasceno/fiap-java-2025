package br.com.fiap.api_rest.repository;

import br.com.fiap.api_rest.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome);
    List<Cliente> findByNomeIs(String nome);
    List<Cliente> findByNomeEquals(String nome);
    List<Cliente> findByNomeEqualsIgnoreCase(String nome);
    List<Cliente> findByNomeIsNot(String nome);
    List<Cliente> findByNomeIsNotEquals(String nome);


}