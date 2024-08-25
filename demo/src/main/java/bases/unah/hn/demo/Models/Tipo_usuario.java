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
public class Tipo_usuario {
    
    @Id
    @Column(name = "id_tipo_usuario")
    private int idTipoUsuario;

    private String tipo_usuario;

    @OneToMany(mappedBy = "tipo_usuario")
    @JsonIgnore
    private List<Usuario> usuario;

}
