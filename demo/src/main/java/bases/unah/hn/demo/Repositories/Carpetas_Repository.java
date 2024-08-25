package bases.unah.hn.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import bases.unah.hn.demo.Models.Carpetas;

public interface Carpetas_Repository extends JpaRepository<Carpetas, Integer> {
    
    @Query(value = "Select nombre_carpeta from tbl_carpetas where id_carpeta = :id", nativeQuery = true)
    String obtenerNombreCarpeta(@Param("id")int id);

    @Query(value = "select to_char(fecha_creacion, 'fmMonth dd, YYYY') from tbl_carpetas where id_carpeta = :id", nativeQuery = true)
    String obtenerFechaCreacion(@Param("id")int id);

    @Query(value = "select a.nombres from tbl_usuario a inner join tbl_carpetas b on(a.id_usuario=b.id_usuario) where b.id_carpeta = :idCarpeta", nativeQuery = true)
    String obtenerNombreCreador(@RequestParam int idCarpeta);

    @Query(value = "select a.id_usuario from tbl_usuario a inner join tbl_carpetas b on(a.id_usuario=b.id_usuario) where b.id_carpeta = :idCarpeta", nativeQuery = true)
    String obtenerIdCreador(@RequestParam int idCarpeta);

    @Query(value = "select a.url_imagen from tbl_usuario a inner join tbl_archivos b on(a.id_usuario=b.id_usuario) where b.id_archivo = :idArchivo", nativeQuery = true)
    String urlFotoPerfil(@RequestParam int idArchivo);

    @Query(value = "select b.tipo_ubicacion from tbl_carpetas a inner join tbl_ubicacion_carpeta b on (a.id_ubicacion_carpeta = b.id_ubicacion_carpeta) where a.id_carpeta = :id", nativeQuery = true)
    String obtenerUbicacionCarpeta(@Param("id")int id);

}
