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
@Data
@Table(name = "TBL_LUGARES")
@Builder
public class Lugares {
    
    @Id
    @Column(name = "id_lugar")
    private int idLugar;

    private String nombre_lugar;

    private String latitud;

    private String longitud;
    
    @ManyToOne
    @JoinColumn(name = "id_pais")
    @JsonIgnore
    private Paises paises;

    @OneToMany(mappedBy = "genero")
    @JsonIgnore
    private List<Usuario> usuario;

}
