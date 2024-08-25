package bases.unah.hn.demo.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table (name = "TBL_TIPO_ARCHIVO")
@Data
@Builder
public class Tipo_archivo {
 
    @Id
    @Column(name = "id_tipo_archivo")
    private int idTipoArchivo;

    private String nombre_tipo_archivo;

    @OneToMany(mappedBy = "tipo_archivo")
    @JsonIgnore
    private List<Archivos> archivo;
}
