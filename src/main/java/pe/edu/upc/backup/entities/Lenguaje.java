package pe.edu.upc.backup.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table (name = "lenguajes")
public class Lenguaje {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "descrip", nullable = false)
    private String descrip;
    @Column (name = "abrev", nullable = false)
    private String abrev;
    @Column (name = "tipo_leng", nullable = false)
    private String tipoLeng;

    public Lenguaje() {
    }

    public Lenguaje(String descrip, String abrev, String tipoLeng) {
        this.descrip = descrip;
        this.abrev = abrev;
        this.tipoLeng = tipoLeng;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getAbrev() {
        return abrev;
    }

    public void setAbrev(String abrev) {
        this.abrev = abrev;
    }

    public String getTipoLeng() {
        return tipoLeng;
    }

    public void setTipoLeng(String tipoLeng) {
        this.tipoLeng = tipoLeng;
    }
}
