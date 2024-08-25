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
@Table(name = "TBL_GENERO")
@Data
@Builder
public class Genero {
    
    @Id
    @Column(name = "id_genero")
    private int idGenero;

    private String tipo_genero;
    
    @OneToMany(mappedBy = "genero")
    @JsonIgnore
    private List<Usuario> usuario;
}
