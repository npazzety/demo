package bases.unah.hn.demo.Service;

import java.util.List;

import bases.unah.hn.demo.Models.Carpetas;


public interface Carpeta_Service {

     public List<Carpetas> obtenerCarpetas();

    public Carpetas buscarCarpetas(int id);
}
