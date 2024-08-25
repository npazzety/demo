package bases.unah.hn.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import bases.unah.hn.demo.Models.Almacenamiento;

public interface Almacenamiento_Repository extends JpaRepository<Almacenamiento, Integer> {
    
    @Query(value = "Select espacio_total from tbl_almacenamiento where id_almacenamiento = :id", nativeQuery = true)
    String obtenerEspacioTotal(@Param("id")int id);

    @Query(value = "Select espacio_disponible from tbl_almacenamiento where id_almacenamiento = :id", nativeQuery = true)
    String obtenerEspacioDisponible(@Param("id")int id);

    @Query(value = "select to_char(fecha_asignacion, 'fmMonth dd, YYYY') from tbl_almacenamiento where id_almacenamiento = :id", nativeQuery = true)
    String obtenerFechaAsignacion(@Param("id")int id);

    @Query(value = "select b.tipo_ubicacion from tbl_almacenamiento a inner join tbl_ubicacion_carpeta b on (a.id_tipo_ubicacion = b.id_tipo_ubicacion) where a.id_almacenamiento = :id", nativeQuery = true)
    String obtenerTipoIdAlmacenamiento(@Param("id")int id);
}

