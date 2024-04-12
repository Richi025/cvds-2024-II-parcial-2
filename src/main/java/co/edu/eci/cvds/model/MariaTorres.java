package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "MARIATORRES")
public class MariaTorres {
    @Id
    @Column(name = "NUMEROPREGUNTA")
    private String numero;
    @Column(name = "RESPUESTA")
    private String respuesta;
    @Column(name = "ARGUMENTO")
    private String argumento;

    public MariaTorres() {
    }

    public MariaTorres(String numero, String respuesta, String argumento) {
        this.numero = numero;
        this.respuesta = respuesta;
        this.argumento = argumento;
    }

    public String getnumero() {
        return numero;
    }

    public void setnumero(String numero) {
        this.numero = numero;
    }

    public String getrespuesta() {
        return respuesta;
    }

    public void setrespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
    public String getrArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }
   
}
