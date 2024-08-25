package bases.unah.hn.demo.Models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table (name = "id_papelera")
@Data
@Builder
public class Papelera {
    
    @Id
    private int id_archivo;

    private Date fecha_eliminado;

    @ManyToOne
    @JoinColumn(name = "id_archivo", referencedColumnName = "id_archivo", insertable = false, updatable = false)
    private Archivos archivos;

    @ManyToOne
    @JoinColumn(name = "id_estado_papelera")
    private Estado_papelera estado_papelera;
   
}
