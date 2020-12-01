/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.G2M2E1.redflix45.modelos;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 *
 * @author ESLUNAP
 */

@Entity
@Table (name="usuario")
public class Usuario implements Serializable {
    
    @Id
    @Column (name = "id_username")
    private String idUsername; //alias
    
    @Column (name="nombre_usuario")
    private String nombreUsuario;
    
    @Column (name="apellido_usuario")
    private String apellidoUsuario;
    
    @Column (name="email_usuario")
    private String emailUsuario;
    
    @Column (name = "celular_usuario")
    private Long celularUsuario;
    
    @Column (name= "contrasena_usuario")
    private String password;
    
    @Column (name ="fecha_nacimiento")
     private String fechaNacimiento;

    public String getIdUsername() {
        return idUsername;
    }

    public void setIdUsername(String idUsername) {
        this.idUsername = idUsername;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public Long getCelularUsuario() {
        return celularUsuario;
    }

    public void setCelularUsuario(Long celularUsuario) {
        this.celularUsuario = celularUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsername=" + idUsername + ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario + ", emailUsuario=" + emailUsuario + ", celularUsuario=" + celularUsuario + ", password=" + password + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    
    
    
}
