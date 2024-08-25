package bases.unah.hn.demo.Service;

import java.util.List;
import java.util.Map;

import bases.unah.hn.demo.Models.Paises;


public interface Paises_Service {
     public List<Paises> obtenerPaises();

    public Paises buscarPais(int id);

    public Map<String, String> obtenerDatos();
}
