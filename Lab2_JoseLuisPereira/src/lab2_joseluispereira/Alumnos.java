/*
 * En la sección de crear cuenta se podrá agregar un alumno, el cual posee un nombre, número de cuenta,
fecha de nacimiento, edad, ciudad de residencia, nacionalidad, ID, user, password, y sus notas en cada
clase.

 */
package lab2_joseluispereira;

import java.util.Date;


public class Alumnos {

    
private String nombre;
private String cuenta;
private String birth;
private int edad;
private String ciudad;
private String nacionalidad;
private String ID;
private String user;
private String pass;
private String notas;

    public Alumnos(String nombre, String cuenta, String birth, int edad, String ciudad, String nacionalidad, String ID, String user, String pass) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.birth = birth;
        this.edad = edad;
        this.ciudad = ciudad;
        this.nacionalidad = nacionalidad;
        this.ID = ID;
        this.user = user;
        this.pass = pass;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
              
}
