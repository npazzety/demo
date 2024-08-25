package bases.unah.hn.demo.Dtos;

import java.sql.Date;

import lombok.Data;

@Data
public class carpetasDto {
    
    private String nombreCarpeta;
    
    private Date FechaCreacion;

    private int idArchivo;

    private String descripcion;

   

}
