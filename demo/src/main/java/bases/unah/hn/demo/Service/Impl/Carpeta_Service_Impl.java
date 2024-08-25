package bases.unah.hn.demo.Service.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bases.unah.hn.demo.Models.Carpetas;
import bases.unah.hn.demo.Repositories.Archivos_Repository;
import bases.unah.hn.demo.Repositories.Carpetas_Repository;
import bases.unah.hn.demo.Service.Carpeta_Service;

@Service
public class Carpeta_Service_Impl implements Carpeta_Service{

    @Autowired
    Carpetas_Repository carpetas_Repository;

    @Autowired
    Archivos_Repository archivos_Repository;

    @Override
    public List<Carpetas> obtenerCarpetas() {
        try {
        
            if(!this.archivos_Repository.findAll().isEmpty()){
                return this.carpetas_Repository.findAll();
            }

            return null;

       } catch (Exception e) {
        e.printStackTrace();
        return null;
       }
    }

    @Override
    public Carpetas buscarCarpetas(int id) {
        try {
            
            if(this.archivos_Repository.findById(id).isPresent()){
                return this.carpetas_Repository.findById(id).get();
            }

            return null;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    
}
    