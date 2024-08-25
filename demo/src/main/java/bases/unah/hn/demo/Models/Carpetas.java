package bases.unah.hn.demo.Models;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table (name = "TBL_CARPETAS")
@Data 
@Builder
public class Carpetas {
    
    @Id
    @Column(name = "id_carpeta")
    private int idCarpeta;

    private String nombre_carpeta;

    private Date fecha_creacion;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

     
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_carpeta")
    private Carpetas CarpetaPadre;

    
    @OneToMany(mappedBy = "CarpetaPadre", cascade = CascadeType.ALL)
    private List<Carpetas> CarpetaHija;

    @OneToMany(mappedBy = "permisos")
    @JsonIgnore
    private List<Permisos> permisos;

    @OneToMany(mappedBy = "archivos")
    @JsonIgnore
    private List<Archivos> archivos;


}
