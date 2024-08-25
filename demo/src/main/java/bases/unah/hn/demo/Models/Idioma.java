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
@Table(name = "TBL_IDIOMA")
@Data
@Builder
public class Idioma {
 
    @Id
    @Column(name = "id_idioma")
    private int idIdioma;

    private String nombre_idioma;
    
    @JsonIgnore
    @OneToMany(mappedBy = "idiomas")
    private List<Paises> paises;
}
