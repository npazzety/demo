package bases.unah.hn.demo.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bases.unah.hn.demo.Models.Genero;
import bases.unah.hn.demo.Repositories.Genero_Repository;
import bases.unah.hn.demo.Service.Genero_Service;

@Service
public class Genero_Service_Impl implements Genero_Service {

       @Autowired
    Genero_Repository genero_Repository;

    @Override
    public java.util.List<Genero> obtenerGeneros() {
        try {
            return this.genero_Repository.findAll();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Genero buscarGenero(int id) {
        try {
            return this.genero_Repository.findById(id).get();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    
}
}
