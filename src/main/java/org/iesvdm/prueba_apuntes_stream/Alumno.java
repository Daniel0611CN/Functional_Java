package org.iesvdm.prueba_apuntes_stream;

public class Alumno extends Persona {


    private String curso;

    public Alumno(String nombre) {
        super(nombre);
    }

    public Alumno(String nombre, String curso) {
        super(nombre);
        this.curso = curso;
    }


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "curso='" + curso + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
