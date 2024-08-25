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
@Table(name = "TBL_TIPO_USUARIO")
@Data
@Builder
public class Ubicacion_Carpeta {
 
     @Id
    @Column(name = "id_tipo_ubicacion")
    private int idTipoUbicacion;

    private String tipo_ubicacion;

    @OneToMany(mappedBy = "almacenamiento")
    @JsonIgnore
    private List<Almacenamiento> almacenamiento;
}

