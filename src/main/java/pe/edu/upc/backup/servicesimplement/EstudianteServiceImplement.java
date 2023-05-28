package pe.edu.upc.backup.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.backup.entities.Estudiante;
import pe.edu.upc.backup.repositories.IEstudianteRepository;
import pe.edu.upc.backup.services.IEstudianteService;

import java.util.List;
@Service
public class EstudianteServiceImplement implements IEstudianteService {
    @Autowired
    private IEstudianteRepository eR;

    @Override
    public void insert(Estudiante estudiante) {
        eR.save(estudiante);
    }

    @Override
    public List<Estudiante> list() {
        return eR.findAll();
    }
}
