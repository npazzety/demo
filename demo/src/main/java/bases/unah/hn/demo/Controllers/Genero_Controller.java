package bases.unah.hn.demo.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bases.unah.hn.demo.Models.Genero;
import bases.unah.hn.demo.Service.Impl.Genero_Service_Impl;


@RestController
@RequestMapping("/genero")
public class Genero_Controller {

    @Autowired
    Genero_Service_Impl genero_Service_Impl;

    @GetMapping("/obtener")
    public List<Genero> obtenerGenero(){
        return this.genero_Service_Impl.obtenerGeneros();
    }

    @GetMapping("/buscar")
    public Genero buscarGenero(@RequestParam int id){
        return this.genero_Service_Impl.buscarGenero(id);
    }
    
}
