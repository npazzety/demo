package bases.unah.hn.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import bases.unah.hn.demo.Models.Papelera;

public interface Papelera_Repository extends JpaRepository<Papelera, Integer> {
    //ojo, no hay llave pria,ria se usa una foranea que viene siendo las dos llaves primarias
    @Query(value = "select to_char(fecha_eliminado, 'fmMonth dd, YYYY') from tbl_papelera where id_archivo = :id", nativeQuery = true)
    String obtenerFechaEliminado(@Param("id")int id);

    @Query(value = "select b.nombre_tipo_estado from tbl_papelera a inner join tbl_tipo_estado b on (a.id_estado_papelera = b.id_estado_papelera) where a.id_papelera = :id", nativeQuery = true)
    String obtenerEstadoPapelera(@Param("id")int id);

    @Query(value = "select a.nombre_archivo from tbl_archivos a inner join tbl_papelera b on(a.id_archivo=b.id_archivo) where b.id_archivo = :idPapeleraArchivo", nativeQuery = true)
    String obtenerNombreArchivo(@RequestParam int idPapeleraArchivo);


}
