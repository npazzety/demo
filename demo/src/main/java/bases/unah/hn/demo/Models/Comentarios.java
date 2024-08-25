package bases.unah.hn.demo.Models;

import java.sql.Date;
import java.util.List;

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
@Table (name = "TBL_COMENATRIOS")
@Data
@Builder
public class Comentarios {

    @Id
    @Column(name = "id_comentario")
    private int idComentario;

    private String comentario_texto;

    private Date fecha_comentario;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_archivo")
    private Archivos archivo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_comentario")
    private Comentarios ComentarioPadre;

    @OneToMany(mappedBy = "ComentarioPadre", cascade = CascadeType.ALL)
    private List<Comentarios> ComentarioHijo;



}
