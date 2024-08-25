package bases.unah.hn.demo.Service;

import java.util.List;

import bases.unah.hn.demo.Models.Idioma;


public interface Idioma_Service {
 
    public List<Idioma> obtenerIdiomas();

    public Idioma buscarIdioma(int id);
}
