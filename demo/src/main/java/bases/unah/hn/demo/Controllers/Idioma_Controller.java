package bases.unah.hn.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bases.unah.hn.demo.Models.Idioma;
import bases.unah.hn.demo.Service.Impl.Idioma_Service_Impl;

@RestController
@RequestMapping("/idiomas")
public class Idioma_Controller {
     @Autowired
    Idioma_Service_Impl isi;

    @GetMapping("/obtener")
    public List<Idioma> obtenerIdiomas(){
        return this.isi.obtenerIdiomas();
    }

    @GetMapping("/buscar")
    public Idioma buscarIdiomas(@RequestParam int id){
        return this.isi.buscarIdioma(id);
    }
}
