package br.com.vinimdev.clientes.model.repository;

import br.com.vinimdev.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
