package bases.unah.hn.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bases.unah.hn.demo.Models.Archivos;
import bases.unah.hn.demo.Service.Impl.Archivos_Service_Impl;


@RestController
@RequestMapping("/archivos")
public class Archivos_Controller {
    
    @Autowired
    Archivos_Service_Impl archivos_Service_Impl;

       @GetMapping("/obtenerArchivos")
    public List<Archivos> obtenerArchivos(){
        return this.archivos_Service_Impl.obtenerArchivos();
    }

    @GetMapping("/buscarArchivos")
    public Archivos buscarAlbum(@RequestParam int id){
        return this.archivos_Service_Impl.buscarArchivos(id);
    }
}
