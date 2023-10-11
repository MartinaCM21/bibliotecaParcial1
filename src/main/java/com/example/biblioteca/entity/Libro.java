package com.example.biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table ( name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class Libro extends Base {


    @Column ( name = "titulo")
    private String titulo;

    @Column ( name = "fecha")
    private Date fecha;

    @Column ( name = "genero")
    private String genero;

    @Column ( name = "paginas")
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    @Builder.Default
    private List<Autor> autor = new ArrayList<Autor>();

}