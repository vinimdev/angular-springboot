package br.com.vinimdev.clientes.model.repository;

import br.com.vinimdev.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
