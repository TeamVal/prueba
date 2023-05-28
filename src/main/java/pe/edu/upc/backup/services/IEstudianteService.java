package pe.edu.upc.backup.services;

import pe.edu.upc.backup.entities.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public void insert(Estudiante estudiante);
    List<Estudiante> list();
}
