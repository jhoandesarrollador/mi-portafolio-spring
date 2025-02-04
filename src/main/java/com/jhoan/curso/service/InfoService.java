package com.jhoan.curso.service;
import com.jhoan.curso.model.Study;
import com.jhoan.curso.model.PersonalInfo;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InfoService {
    public PersonalInfo getPersonalInfo() {
        PersonalInfo info = new PersonalInfo();

        info.setName("Jhoan Sebastian ");
        info.setApellido("Sanchez Ocampo");
        info.setBio(" Desarrollador backend con experiencia en Spring Boot ...");
        info.setBio2("Desarrollador Backend especializado en Java y Spring Boot. En formación constante para crear aplicaciones escalables, seguras y mantenibles. Actualmente, perfecciono mis habilidades con cursos avanzados en Udemy y proyectos prácticos. Mi meta es resolver problemas complejos con código limpio y arquitecturas sólidas. ");
        info.setEmail("jhoan17sebastia@gmail.com");
        info.setTelefono("3215354653");
        info.setLinkedin("https://www.linkedin.com/in/jhoan-sebastian-sanchez-ocam/");
        info.setGithub("https://github.com/jhoandesarrollador/");
        info.setLocation("Rionegro, Colombia");
        info.setCvUrl("src/main/resources/static/JHOAN SEBASTIAN SANCHEZ OCAMPOo-1(1).pdf");





        // Estudios
        Study study1 = new Study();
        study1.setTitle("Tecnico en analisis y desarrollo de software");
        study1.setInstitution("en el polictenico Asys");
        study1.setPeriod(" 2024");
        study1.setAchievements(List.of(
                "Promedio 4.7",
                "Proyecto destacado: <a href='https://github.com/jhoandesarrollador/mp3' target='_blank ' >un mp3</a>"
        ));
        study1.setSubtitulo("Otros estudios ");
        study1.setCursoAparte("Estoy haciendo un diplomado virtual con el polictenico de colombia, " +
                "complementando en udemy mis conocimientos de java y spring-boot ,spring-security, " +
                "spring data JPA y comenzando la ingenieria en desarrollo de software con " +
                "uniminuto virtual.");


        info.setStudies(List.of(study1));

        return info;
    }
}