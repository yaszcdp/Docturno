package com.example.tpfinallab3.entities;

import java.util.Objects;
import java.util.Scanner;

public class Medico extends Usuario {
    private Especialidad especialidad;
    private Boolean isDisponible;

    private String numeroMatricula;

    public Medico() {
    }

    public Medico(String nombreUsuario, String contrasena, String nombre, String apellido, String mail, Especialidad especialidad, String numeroMatricula) {
        super(nombreUsuario, contrasena, nombre, apellido, mail);
        this.especialidad = especialidad;
        this.numeroMatricula = numeroMatricula;
        this.isDisponible = true;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Boolean getDisponible() {
        return isDisponible;
    }

    public void setDisponible(Boolean disponible) {
        isDisponible = disponible;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null) {
            return false;
        }
        if(!(o instanceof Medico)) {
            return false;
        }
        Medico medico = (Medico) o;
        return this.getNombreUsuario().equalsIgnoreCase(medico.getNombreUsuario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getNombreUsuario());
    }

    @Override
    public String toString() {
        return "MEDICO\n" +
                super.toString() +
                "Especialidad: " + especialidad.getEspecialidad() + "\n" +
                "Disponible: " + (isDisponible? "si" : "no");
    }

    @Override
    public void cargar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de usuario: ");
        setNombreUsuario(scanner.nextLine());
        System.out.println("Ingrese contraseña: ");
        setContrasena(scanner.nextLine());
        System.out.println("Ingrese nombre: ");
        setNombre(scanner.nextLine());
        System.out.println("Ingrese apellido: ");
        setApellido(scanner.nextLine());
        System.out.println("Ingrese mail: ");
        setMail(scanner.nextLine());
        System.out.println("Seleccione especialidad: ");
        setEspecialidad(Especialidad.CARDIOLOGIA);//HARDCODEADO HASTA QUE HAGAMOS LA INTERFAZ GRAFICA
        setDisponible(true);
    }
}
