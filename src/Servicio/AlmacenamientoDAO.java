package Servicio;

public class AlmacenamientoDAO {
    
  public AlmacenamientoDAO() {
    
    }  
  //Atributos MER
  private int CodigoAlmacenamiento;
  private String DescripcionAlmacenamiento;
  
  public AlmacenamientoDAO(int CodigoAlmacenamiento, String DescripcionAlmacenamiento){
      this.CodigoAlmacenamiento = CodigoAlmacenamiento;
      this.DescripcionAlmacenamiento = DescripcionAlmacenamiento;
  }

    public int getCodigoAlmacenamiento() {
        return CodigoAlmacenamiento;
    }

    public void setCodigoAlmacenamiento(int CodigoAlmacenamiento) {
        this.CodigoAlmacenamiento = CodigoAlmacenamiento;
    }

    public String getDescripcionAlmacenamiento() {
        return DescripcionAlmacenamiento;
    }

    public void setDescripcionAlmacenamiento(String DescripcionAlmacenamiento) {
        this.DescripcionAlmacenamiento = DescripcionAlmacenamiento;
    }
  
}
