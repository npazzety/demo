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
@Table (name = "TBL_COMPARTIDOS")
@Data
@Builder
public class Compartidos {
    
     @Id
    @Column(name = "id_compartido")
    private int idCompartido;

    private Date fecha_compartido;

    @ManyToOne
    @JoinColumn(name = "id_archivo")
    private Archivos archivos;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;
}
