package bases.unah.hn.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import bases.unah.hn.demo.Models.Permisos;

public interface Permisos_Repository extends JpaRepository<Permisos, Integer> {
    
    @Query(value = "select to_char(fecha_asignacion, 'fmMonth dd, YYYY') from tbl_permisos where id_permiso = :id", nativeQuery = true)
    String obtenerFechaAsignacion(@Param("id")int id);

    @Query(value = "select b.nombre_tipo_permiso from tbl_permisos a inner join tbl_tipo_permiso b on (a.id_tipo_permiso = b.id_tipo_permiso) where a.id_permiso = :id", nativeQuery = true)
    String obtenerTipoPermiso(@Param("id")int id);


}
