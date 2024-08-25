package bases.unah.hn.demo.Models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "TBL_PAISES")
@Data
@Builder
public class Paises {
    
    @Id
    @Column(name = "id_pais")
    private int idPais;

    private String nombre_pais;

    private String abreviacion_pais;

    private String icono_pais;

    @ManyToOne
    @JoinColumn(name = "id_idioma")
    @JsonIgnore
    private Idioma idioma;

    @OneToMany(mappedBy = "paises")
    @JsonIgnore
    private List<Lugares> lugares;
}


