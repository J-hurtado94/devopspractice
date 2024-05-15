package com.devops.devopsitm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Estudiante {




    @GetMapping("/materias-estudiante")
    public List<String> getMaterias(){
        List<String> materias=new ArrayList<>();
        materias.add("Matematicas");
        materias.add("Fisica");
        materias.add("Programacion");
        return materias;
    }
}
