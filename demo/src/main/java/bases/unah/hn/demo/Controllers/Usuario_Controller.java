package bases.unah.hn.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bases.unah.hn.demo.Service.Impl.Usuario_Service_Impl;

@RestController
@RequestMapping("/usuario")
public class Usuario_Controller {
    
    @Autowired
    Usuario_Service_Impl usuario_Service_Impl;

    @GetMapping("/validar")
    public String seguirUsuario(@RequestParam String correo, @RequestParam String contrasenia){
        return this.usuario_Service_Impl.validarUsuario(correo, contrasenia);
    }

}
