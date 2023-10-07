package entidades;

import java.util.List;

public class Asistencia {
    private String codigoCarpeta;
    private String nombreEst;
    private String claseEst;
    private String asistenciaEst;
    
    private List<Estudiante> estudiantes;
    
    public Asistencia(String codigoCarpeta, String nombreEst, String claseEst, String asistenciaEst) {
        this.codigoCarpeta = codigoCarpeta;
        this.nombreEst = nombreEst;
        this.claseEst = claseEst;
        this.asistenciaEst = asistenciaEst;
    }

    public String getCodigoCarpeta() {
        return codigoCarpeta;
    }

    public void setCodigoCarpeta(String codigoCarpeta) {
        this.codigoCarpeta = codigoCarpeta;
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public String getClaseEst() {
        return claseEst;
    }

    public void setClaseEst(String claseEst) {
        this.claseEst = claseEst;
    }

    public String getAsistenciaEst() {
        return asistenciaEst;
    }

    public void setAsistenciaEst(String asistenciaEst) {
        this.asistenciaEst = asistenciaEst;
    }
    
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void agregarEstudiante(Estudiante estudiante){
             if(this.estudiantes != null &&
                this.estudiantes.size()>=0){
            estudiantes.add(estudiante);
        }
    }    
    
    public String getTextoEst(){
        return this.getCodigoCarpeta() + " | " + this.nombreEst + " | " + this.claseEst + " | " + this.asistenciaEst; 
    }
}