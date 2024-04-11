package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.MariaTorres;
import co.edu.eci.cvds.service.MariaTorresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/maria_torres")
public class MariaTorresController {

    private final MariaTorresService mariaTorresService;

    @Autowired
    public MariaTorresController(MariaTorresService mariaTorresService) {
        this.mariaTorresService = mariaTorresService;
    }
    @GetMapping("")
    public String apiParcial() {
        return "index";
    }

    @GetMapping("/parcial")
    @ResponseBody
    public List<MariaTorres> toList() {
        return mariaTorresService.getAllMariaTorres();
    }

   }

