
package lab2_joseluispereira;


public class Examen {
  private String respues;
  private String pregunt;

    public Examen(String respues, String pregunt) {
        this.respues = respues;
        this.pregunt = pregunt;
    }

  
    public String getRespues() {
        return respues;
    }

    public void setRespues(String respues) {
        this.respues = respues;
    }

    public String getPregunt() {
        return pregunt;
    }

    public void setPregunt(String pregunt) {
        this.pregunt = pregunt;
    }
  
  
  
}
