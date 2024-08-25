package bases.unah.hn.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import bases.unah.hn.demo.Models.Comentarios;


public interface Comentarios_Repository extends JpaRepository<Comentarios, Integer> {
 
    @Query(value = "Select comentario_texto from tbl_comentarios where id_comentario = :id", nativeQuery = true)
    String obtenerComentario(@Param("id")int id);

    @Query(value = "select to_char(fecha_comentario, 'fmMonth dd, YYYY') from tbl_comentarios where id_comentario = :id", nativeQuery = true)
    String obtenerFechaComentario(@Param("id")int id);

    @Query(value = "select a.nombres from tbl_usuario a inner join tbl_comentarios b on(a.id_usuario=b.id_usuario) where b.id_comentario = :idComentario", nativeQuery = true)
    String obtenerNombreCreador(@RequestParam int idComentario);

}