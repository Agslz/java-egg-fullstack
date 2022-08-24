package Libreria.Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;

@Entity
@Table(name = "Libro")

public class Libro implements Serializable {

//    @Id
//    private Long isbn;
//    private String titulo;
//    private Integer anio;
//    private Integer ejemplares;
//    private Integer ejemplaresPrestados;
//    private Integer ejemplaresRestantes;
//    private Boolean alta;
//
//    @OneToOne
//    private Autor autor;
//    @OneToOne
//    private Editorial editorial;

}
