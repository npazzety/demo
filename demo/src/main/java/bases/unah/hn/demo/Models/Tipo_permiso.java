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
@Table (name = "TBL_TIPO_PERMISO")
@Data
@Builder
public class Tipo_permiso {
    
    @Id
    @Column(name = "id_tipo_permiso")
    private int idTipoPermiso;

    private String tipo_permiso;

    @OneToMany(mappedBy = "tipo_permiso")
    @JsonIgnore
    private List<Permisos> permisos;
}
