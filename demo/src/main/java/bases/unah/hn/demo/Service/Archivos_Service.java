package bases.unah.hn.demo.Service;

import java.util.List;

import bases.unah.hn.demo.Models.Archivos;


public interface Archivos_Service{

    public List<Archivos> obtenerArchivos();

    public Archivos buscarArchivos(int id);
}
