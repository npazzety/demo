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
@Data
@Builder
@Table(name = "TBL_USUARIO")
public class Usuario {

    @Id
    @Column(name = "id_usuario")
    private int idUsuario;

    private String correo;

    private String nombres;

    private String apellidos;

    private String numero_telefono;

    private Date fecha_nacimiento;

    private Date fecha_registro;

    private String contrasenia;

    private String url_foto_perfil;

    @ManyToOne
    @JoinColumn(name = "id_lugar")
    private Lugares lugares;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "id_tipo_usuario")
    private Tipo_usuario tipo_usuario;

    @OneToMany(mappedBy = "contactos")
    @JsonIgnore
    private List<Contactos> contactos;

    @OneToMany(mappedBy = "almacenamiento")
    @JsonIgnore
    private List<Almacenamiento> almacenamiento;

    @OneToMany(mappedBy = "comentarios")
    @JsonIgnore
    private List<Comentarios> comentarios;

    @OneToMany(mappedBy = "archivos")
    @JsonIgnore
    private List<Archivos> archivos;
 
    @OneToMany(mappedBy = "carpetas")
    @JsonIgnore
    private List<Carpetas> carpetas;

    @OneToMany(mappedBy = "usuario")
    private List<Permisos> permiso;

    @OneToMany(mappedBy = "usuarioAsignador")
    private List<Permisos> permisoAsignador;

    @OneToMany(mappedBy = "compartidos")
    @JsonIgnore
    private List<Compartidos> compartidos;
}
