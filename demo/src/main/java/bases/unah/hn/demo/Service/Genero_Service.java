package bases.unah.hn.demo.Service;

import java.util.List;

import bases.unah.hn.demo.Models.Genero;


public interface Genero_Service {
    
    public List<Genero> obtenerGeneros();

    public Genero buscarGenero(int id);
}
