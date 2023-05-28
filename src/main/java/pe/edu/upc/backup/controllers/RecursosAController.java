package pe.edu.upc.backup.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.backup.dtos.RecursosADTO;
import pe.edu.upc.backup.entities.RecursosA;
import pe.edu.upc.backup.services.IRecursosAService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recursos")
public class RecursosAController {
    @Autowired
    private IRecursosAService lS;
    @PostMapping
    public void insert(@RequestBody RecursosADTO dto){
        ModelMapper m=new ModelMapper();
        RecursosA a=m.map(dto, RecursosA.class);
        lS.insert(a);
    }
    @GetMapping
    public List<RecursosADTO> List(){
        return lS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, RecursosADTO.class);
        }).collect(Collectors.toList());
    }
}
