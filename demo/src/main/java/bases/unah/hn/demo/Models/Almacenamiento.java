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
@Table (name = "TBL_ALMACENAMIENTO")
@Data
@Builder
public class Almacenamiento {
    
    @Id
    @Column(name = "id_almacenamiento")
    private int idAlmacenamiento;

    private int espacio_total;

    private int espacio_disponible;

    private Date fecha_asignacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_tipo_ubicacion")
    private Ubicacion_Carpeta ubicacion_Carpeta;

    
}
