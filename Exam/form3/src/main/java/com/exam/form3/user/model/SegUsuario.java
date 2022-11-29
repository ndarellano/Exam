package com.exam.form3.user.model;
import java.util.Date;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "seg_usuario")
public class SegUsuario {
    @Id
    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;
    
    @Column(name = "username", nullable = false, length = 32)
    private String username;

    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name = "mail", nullable = false, length = 128, unique = true)
    private String mail;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @Column(name = "clave", nullable = false, length = 64)
    private String clave;

    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;

    @Column(name = "rol", nullable = false, length = 5)
    private String rol;

    public SegUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }
}
