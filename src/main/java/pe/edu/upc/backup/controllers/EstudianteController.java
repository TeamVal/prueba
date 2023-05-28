package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.EstudianteDTO;
import pe.edu.upc.backup.entities.Estudiante;
import pe.edu.upc.backup.services.IEstudianteService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private IEstudianteService eS;
    @PostMapping
    public void insert(@RequestBody EstudianteDTO dto){
        ModelMapper m=new ModelMapper();
        Estudiante a=m.map(dto, Estudiante.class);
        eS.insert(a);
    }
    @GetMapping
    public List<EstudianteDTO> List(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, EstudianteDTO.class);
        }).collect(Collectors.toList());
    }
}
