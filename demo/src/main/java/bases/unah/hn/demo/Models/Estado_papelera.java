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
@Table (name = "TBL_ESTADO_PAPELERA")
@Data
@Builder
public class Estado_papelera {
    
    @Id
    @Column(name = "id_estado_papelera")
    private int idEstadoPapelera;

    private String tipo_estado;

    @OneToMany(mappedBy = "estado_papelera")
    @JsonIgnore
    private List<Papelera> papelera;
}
