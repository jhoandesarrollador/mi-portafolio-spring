package com.jhoan.curso.model;
import java.util.List;

public class Study {
    private String title;
    private String subtitulo;
    private String institution;
    private String period;
    private List<String> achievements;
    private  String cursoAparte;

    // Getters y Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public List<String> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<String> achievements) {
        this.achievements = achievements;
    }
    public String getCursoAparte (){
        return cursoAparte;
    }
    public void setCursoAparte (String cursoAparte){
        this.cursoAparte = cursoAparte;
    }
}