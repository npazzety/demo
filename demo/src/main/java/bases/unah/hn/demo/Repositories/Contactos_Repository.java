package bases.unah.hn.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import bases.unah.hn.demo.Models.Contactos;

public interface Contactos_Repository extends JpaRepository<Contactos, Integer> {
 
    @Query(value = "Select id_contacto from tbl_contactos where id_contacto = :id", nativeQuery = true)
    String obtenerIdContacto(@Param("id")int id);
}
