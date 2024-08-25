package bases.unah.hn.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import bases.unah.hn.demo.Models.Archivos;

public interface Archivos_Repository extends JpaRepository<Archivos, Integer> {
 
    @Query(value = "Select nombre_archivo from tbl_archivos where id_archivo = :id", nativeQuery = true)
    String obtenerNombre(@Param("id")int id);

    @Query(value = "Select descripcion from tbl_archivos where id_archivo = :id", nativeQuery = true)
    String obtenerDescripcion(@Param("id")int id);

    @Query(value = "select to_char(fecha_subida, 'fmMonth dd, YYYY') from tbl_archivos where id_archivo = :id", nativeQuery = true)
    String obtenerFechaSubida(@Param("id")int id);

    @Query(value = "select b.nombre_tipo_archivo from tbl_archivos a inner join tbl_tipo_archivo b on (a.id_tipo_archivo = b.id_tipo_archivo) where a.id_archivo = :id", nativeQuery = true)
    String obtenerTipoArchivo(@Param("id")int id);

    @Query(value = "select b.imagen_archivo from tbl_archivos a inner join tbl_tipo_archivo b on (a.id_tipo_archivo = b.id_tipo_archivo) where a.id_archivo = :id", nativeQuery = true)
    String obtenerImagenArchivo(@Param("id")int id);

    @Query(value = "select a.nombres from tbl_usuario a inner join tbl_archivos b on(a.id_usuario=b.id_usuario) where b.id_archivo = :idArchivo", nativeQuery = true)
    String obtenerNombreCreador(@RequestParam int idArchivo);

    @Query(value = "select a.id_usuario from tbl_usuario a inner join tbl_archivos b on(a.id_usuario=b.id_usuario) where b.id_archivo = :idArchivo", nativeQuery = true)
    String obtenerIdCreador(@RequestParam int idArchivo);

    @Query(value = "select a.url_imagen from tbl_usuario a inner join tbl_archivos b on(a.id_usuario=b.id_usuario) where b.id_archivo = :idArchivo", nativeQuery = true)
    String urlFotoPerfil(@RequestParam int idArchivo);

    @Query(value = "select count(1) from tbl_archivos where id_carpeta = :id", nativeQuery = true)
    int contarArchivos(@Param("id") int id);
}
