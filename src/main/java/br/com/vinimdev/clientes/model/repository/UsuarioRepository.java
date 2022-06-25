package br.com.vinimdev.clientes.model.repository;

import br.com.vinimdev.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
