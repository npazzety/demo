package bases.unah.hn.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bases.unah.hn.demo.Models.Tipo_usuario;

public interface Tipo_usuario_Repository extends JpaRepository<Tipo_usuario, Integer> {
    
}
