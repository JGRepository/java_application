package com.example.projeto.controle;

import com.example.projeto.modelos.Estado;
import com.example.projeto.repositorios.EstadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EstadoControle {

    @Autowired
    private EstadoRepositorio estadoRepositorio;

    @GetMapping("cadastroEstado")
    public ModelAndView cadastrar(Estado estado) {
        ModelAndView mv = new ModelAndView("admin/estados/cadastro");
        mv.addObject("estado", estado);
        return mv;
    }

}
