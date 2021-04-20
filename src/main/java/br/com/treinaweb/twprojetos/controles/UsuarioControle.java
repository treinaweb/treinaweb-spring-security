package br.com.treinaweb.twprojetos.controles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioControle {

    @GetMapping("/login")
    public String login() {
        return "usuario/login";
    }
    
}
