package bases.unah.hn.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bases.unah.hn.demo.Models.Idioma;
import bases.unah.hn.demo.Repositories.Idioma_Repository;
import bases.unah.hn.demo.Service.Idioma_Service;

@Service
public class Idioma_Service_Impl implements Idioma_Service {
    
    @Autowired
    Idioma_Repository idioma_Repository;

    @Override
    public List<Idioma> obtenerIdiomas() {
        try {
            return this.idioma_Repository.findAll();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Idioma buscarIdioma(int id) {
        try {
            return this.idioma_Repository.findById(id).get();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
