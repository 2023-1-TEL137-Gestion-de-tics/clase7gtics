package com.example.clase7gtics.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario", nullable = false)
    private Integer id;

    @Size(max = 45)
    @NotNull
    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;

    @Size(max = 45)
    @NotNull
    @Column(name = "apellido", nullable = false, length = 45)
    private String apellido;

    @Size(max = 8)
    @NotNull
    @Column(name = "dni", nullable = false, length = 8)
    private String dni;

    @Column(name = "edad")
    private Integer edad;

    @Size(max = 100)
    @NotNull
    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @Size(max = 100)
    @NotNull
    @Column(name = "pwd", nullable = false, length = 100)
    private String pwd;

    @NotNull
    @Column(name = "activo", nullable = false)
    private Boolean activo = false;

}