package bases.unah.hn.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import bases.unah.hn.demo.Models.Compartidos;

public interface Compartidos_Repository  extends JpaRepository<Compartidos, Integer>{
    
    @Query(value = "select a.nombres from tbl_usuario a inner join tbl_compartidos b on(a.id_usuario=b.id_usuario) where b.id_compartidos = :idCompartido", nativeQuery = true)
    String obtenerNombreUsuarioQueCompartio(@RequestParam int idCompartido);

    @Query(value = "select a.nombre_archivo from tbl_archivos a inner join tbl_compartidos b on(a.id_archivo=b.id_archivo) where b.id_compartidos = :idCompartidoArchivo", nativeQuery = true)
    String obtenerNombreArchivo(@RequestParam int idCompartidoArchivo);

    @Query(value = "select to_char(fecha_compartido, 'fmMonth dd, YYYY') from tbl_compartidos where id_compartidos = :id", nativeQuery = true)
    String obtenerFechaCompartido(@Param("id")int id);

    


}
