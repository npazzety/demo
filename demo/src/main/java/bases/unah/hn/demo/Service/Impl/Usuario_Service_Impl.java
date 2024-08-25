package bases.unah.hn.demo.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bases.unah.hn.demo.Repositories.Usuarios_Repository;
import bases.unah.hn.demo.Service.Usuario_Service;

@Service
public class Usuario_Service_Impl implements Usuario_Service {
 
    @Autowired
    Usuarios_Repository usuarios_Repository;

    @Override
    public String validarUsuario(String correo, String cotrasenia) {
        Integer success = 0;
        String message = "El usuario no existe";
        try {

            String user = usuarios_Repository.obtenerPorCorreo(correo);

        if (user!=null) { //Si usuario existe

            String[] usuario = user.split(",");

            if (usuario[2].equals(cotrasenia)) {
                success = Integer.parseInt(usuario[0]);
                message = "Usuario validado";
                return String.format("{\"success\":%s,\"message\":\"%s\"}",success,message);
            }else{
                message = "La contraseña no coincide con el correo";
                return String.format("{\"success\":%s,\"message\":\"%s\"}",success.toString(),message);
            }
        }  
        return String.format("{\"success\":%s,\"message\":\"%s\"}",success,message);
        } catch (Exception e) {
            e.printStackTrace();
            return String.format(success.toString(),"{\"success\":%s,\"message\":\"Algo ha fallado, intentalo de nuevo\"}");
        }
    }
}
