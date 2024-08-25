package bases.unah.hn.demo.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table  (name = "TBL_PERMISOS")
@Data
@Builder
public class Permisos {
    
     @Id
    @Column(name = "id_permiso")
    private int idPermiso;

    private Date fecha_asignacion;

     @ManyToOne
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_usuario_asignador", referencedColumnName = "id_usuario", insertable = false, updatable = false)
    private Usuario usuariosAsignador;

    @ManyToOne
    @JoinColumn(name = "id_archivo")
    private Archivos archivos;

    @ManyToOne
    @JoinColumn(name = "id_carpeta")
    private Carpetas carpetas;

    @ManyToOne
    @JoinColumn(name = "id_tipo_permiso")
    private Tipo_permiso tipo_permiso;

}
