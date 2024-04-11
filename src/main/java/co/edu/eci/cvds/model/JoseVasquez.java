package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "JOSE_VASQUEZ")
public class JoseVasquez {

    @Id
    @Column(name = "PREGUNTA")
    private String pregunta;
    @Column(name = "RESPUESTA")
    private String respuesta;
    @Column(name = "ARGUMENTO")
    private String argumento;

    public JoseVasquez(){

    }

    public JoseVasquez(String pregunta, String respuesta, String argumento){
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.argumento = argumento;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }
    

}
