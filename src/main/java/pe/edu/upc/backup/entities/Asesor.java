package pe.edu.upc.backup.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "asesores")
public class Asesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ape", nullable = false)
    private String ape;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "tel", nullable = false)
    private Long tel;

    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "arch", nullable = false)
    private String arch;

    public Asesor() {
    }
    public Asesor(String ape, String nom, Long tel, String correo, String arch) {
        this.ape = ape;
        this.nom = nom;
        this.tel = tel;
        this.correo = correo;
        this.arch = arch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }
}
