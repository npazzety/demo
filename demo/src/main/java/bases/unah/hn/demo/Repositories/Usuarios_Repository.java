package bases.unah.hn.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import bases.unah.hn.demo.Models.Usuario;

public interface Usuarios_Repository extends JpaRepository<Usuario, Integer> {
 
    @Query(value = "select nombrez from tbl_usuarios where id_usuario = :id", nativeQuery = true)
    String obtenerNombreUsuario(@RequestParam int id);

    @Query(value = "select id_usuario,correo,contrasena from tbl_usuarios where correo=:correo", nativeQuery = true)
    String obtenerPorCorreo(@Param("correo") String correo);

    @Query(value = "select url_imagen from tbl_usuarios where id_usuario= :id", nativeQuery = true)
    String urlFotoPerfil(@RequestParam int id);

    @Query(value = "select b.tipo_usuario from tbl_usuarios a inner join tbl_tipo_usuario b on (a.id_tipo_usuario = b.id_tipo_usuario) where a.id_usuario = :id", nativeQuery = true)
    String obtenerTipoUsuario(@Param("id")int id);
}

