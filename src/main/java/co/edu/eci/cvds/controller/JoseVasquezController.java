package co.edu.eci.cvds.controller;


import co.edu.eci.cvds.model.JoseVasquez;
import co.edu.eci.cvds.service.JoseVasquezService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/jose_vasquez")
public class JoseVasquezController {

    private final JoseVasquezService joseVasquezService;

    @Autowired
    public JoseVasquezController(JoseVasquezService joseVasquezService) {
        this.joseVasquezService = joseVasquezService;
    }

    @GetMapping("")
    public String apiParcial() {
        return "index";
    }
    @GetMapping("/parcial")
    @ResponseBody
    public List<JoseVasquez> List() {
        return joseVasquezService.getAllJoseVasquez();
    }

    

}
