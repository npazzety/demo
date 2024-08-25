package bases.unah.hn.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bases.unah.hn.demo.Models.Archivos;
import bases.unah.hn.demo.Repositories.Archivos_Repository;
import bases.unah.hn.demo.Service.Archivos_Service;

@Service
public class Archivos_Service_Impl implements Archivos_Service{

    @Autowired
    Archivos_Repository archivos_Repository;

    @Override
    public List<Archivos> obtenerArchivos() {
        try {
        
            if(!this.archivos_Repository.findAll().isEmpty()){
                return this.archivos_Repository.findAll();
            }

            return null;

       } catch (Exception e) {
        e.printStackTrace();
        return null;
       }
    }

    @Override
    public Archivos buscarArchivos(int id) {
        try {
            
            if(this.archivos_Repository.findById(id).isPresent()){
                return this.archivos_Repository.findById(id).get();
            }

            return null;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
 
    


}
