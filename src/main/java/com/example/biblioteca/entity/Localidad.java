package com.example.biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table ( name = "localidad")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
@Builder
@EqualsAndHashCode(callSuper=false)
public class Localidad extends Base {

    @Column ( name = "denominacion")
    private String denominacion;
}