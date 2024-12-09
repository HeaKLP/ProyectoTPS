package Servicio;

public class AlmacenamientoDAO {
    
  public AlmacenamientoDAO() {
    
    }  
  //Atributos MER
  private int CodigoAlmacenamiento;
  private String temperaturaAlmacenamiento;
  private String DescripcionAlmacenamiento;

    public int getCodigoAlmacenamiento() {
        return CodigoAlmacenamiento;
    }

    public void setCodigoAlmacenamiento(int CodigoAlmacenamiento) {
        this.CodigoAlmacenamiento = CodigoAlmacenamiento;
    }


  
  public AlmacenamientoDAO(String temperaturaAlmacenamiento, String DescripcionAlmacenamiento){
      this.temperaturaAlmacenamiento = temperaturaAlmacenamiento;
      this.DescripcionAlmacenamiento = DescripcionAlmacenamiento;
  }

    public String getTemperaturaAlmacenamiento() {
        return temperaturaAlmacenamiento;
    }

    public void setTemperaturaAlmacenamiento(String TemperaturaAlmacenamiento) {
        this.temperaturaAlmacenamiento = TemperaturaAlmacenamiento;
    }

    public String getDescripcionAlmacenamiento() {
        return DescripcionAlmacenamiento;
    }

    public void setDescripcionAlmacenamiento(String DescripcionAlmacenamiento) {
        this.DescripcionAlmacenamiento = DescripcionAlmacenamiento;
    }
  
}
