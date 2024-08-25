package bases.unah.hn.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bases.unah.hn.demo.Models.Paises;
import bases.unah.hn.demo.Service.Impl.Paises_Service_Impl;

@RestController
@RequestMapping("/paises")
public class Paises_Controller {
    @Autowired
    Paises_Service_Impl pImpl;

    @GetMapping("/obtener")
    public List<Paises> obtenerPaises() {
        return this.pImpl.obtenerPaises();
    }
}
