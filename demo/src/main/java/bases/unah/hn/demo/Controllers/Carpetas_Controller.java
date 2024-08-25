package bases.unah.hn.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bases.unah.hn.demo.Models.Carpetas;
import bases.unah.hn.demo.Service.Impl.Carpeta_Service_Impl;

@RestController
@RequestMapping("/carpetas")
public class Carpetas_Controller {
 
   
    @Autowired
    Carpeta_Service_Impl carpeta_Service_Impl;

       @GetMapping("/obtenerCarpetas")
    public List<Carpetas> obtenerCarpetas(){
        return this.carpeta_Service_Impl.obtenerCarpetas();
    }

    @GetMapping("/buscarCarpetas")
    public Carpetas buscarAlbum(@RequestParam int id){
        return this.carpeta_Service_Impl.buscarCarpetas(id);
    }

}
