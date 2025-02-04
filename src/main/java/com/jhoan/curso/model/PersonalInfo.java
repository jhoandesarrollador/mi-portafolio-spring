package com.jhoan.curso.model;
import java.util.List;

public class PersonalInfo {
    private String name;
    private String apellido;
    private String bio;
    private String bio2;
    private String email;
    private String telefono;
    private String linkedin;
    private String github;
    private String location;
    private List<Study> studies;
    private String cvUrl;
    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
     public String getBio2(){
        return bio2;
     }
     public void setBio2(String bio2) {
        this.bio2 = bio2;
     }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Study> getStudies() {
        return studies;
    }

    public void setStudies(List<Study> studies) {
        this.studies = studies;
    }

    public String getCvUrl() {
        return cvUrl;
    }



    public void setCvUrl(String cvUrl) {
        this.cvUrl = cvUrl;
    }


}
