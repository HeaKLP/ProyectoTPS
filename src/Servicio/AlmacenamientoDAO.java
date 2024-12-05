package Servicio;

public class AlmacenamientoDAO {
    
  public AlmacenamientoDAO() {
    
    }  
  //Atributos MER
  private String TemperaturaAlmacenamiento;
  private String DescripcionAlmacenamiento;
  
  public AlmacenamientoDAO(String TemperaturaAlmacenamiento, String DescripcionAlmacenamiento){
      this.TemperaturaAlmacenamiento = TemperaturaAlmacenamiento;
      this.DescripcionAlmacenamiento = DescripcionAlmacenamiento;
  }

    public String getTemperaturaAlmacenamiento() {
        return TemperaturaAlmacenamiento;
    }

    public void setTemperaturaAlmacenamiento(String TemperaturaAlmacenamiento) {
        this.TemperaturaAlmacenamiento = TemperaturaAlmacenamiento;
    }

    public String getDescripcionAlmacenamiento() {
        return DescripcionAlmacenamiento;
    }

    public void setDescripcionAlmacenamiento(String DescripcionAlmacenamiento) {
        this.DescripcionAlmacenamiento = DescripcionAlmacenamiento;
    }
  
}
