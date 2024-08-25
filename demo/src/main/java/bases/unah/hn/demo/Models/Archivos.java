package bases.unah.hn.demo.Models;

import java.sql.Date;
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
@Table (name = "TBL_ARCHIVOS")
@Data
@Builder
public class Archivos {

    @Id
    @Column(name = "id_archivo")
    private int idArchivo;

    private String nombre_archivo;

    private Date fecha_subida;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_tipo_archivo")
    private Tipo_archivo tipo_archivo;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_carpeta")
    private Carpetas carpetas;

    @OneToMany(mappedBy = "permisos")
    @JsonIgnore
    private List<Permisos> permisos;

    @OneToMany(mappedBy = "compartidos")
    @JsonIgnore
    private List<Compartidos> compartidos;

    @OneToMany(mappedBy = "comentarios")
    @JsonIgnore
    private List<Comentarios> comentarios;

    
}
