package Servicio;

import Negocio.LaboratorioBO;
import java.util.ArrayList;
import java.util.List;

public class LaboratorioDAO {
    private final List<LaboratorioBO> laboratorios = new ArrayList<>();

    public void agregarLaboratorio(LaboratorioBO laboratorio) {
        laboratorio.setCodigoLaboratorio(laboratorios.size() + 1); 
        laboratorios.add(laboratorio);
    }

    public void agregarLaboratorio(String nombre) {
        LaboratorioBO laboratorio = new LaboratorioBO();
        laboratorio.setNombreLaboratorio(nombre);
        agregarLaboratorio(laboratorio);
    }

    public void editarLaboratorio(int codigoLaboratorio, String nuevoNombre) {
        for (LaboratorioBO lab : laboratorios) {
            if (lab.getCodigoLaboratorio() == codigoLaboratorio) {
                lab.setNombreLaboratorio(nuevoNombre);
                break;
            }
        }
    }

    public void eliminarLaboratorio(int codigoLaboratorio) {
        laboratorios.removeIf(lab -> lab.getCodigoLaboratorio() == codigoLaboratorio);
        reordenarCodigos();
    }

    private void reordenarCodigos() {
        for (int i = 0; i < laboratorios.size(); i++) {
            laboratorios.get(i).setCodigoLaboratorio(i + 1); // Reajusta los códigos de laboratorio
        }
    }

    public List<LaboratorioBO> obtenerLaboratorios() {
        return laboratorios;
    }

    public int obtenerUltimoIdLaboratorio() {
        if (laboratorios.isEmpty()) {
            return 1;
        }
        return laboratorios.get(laboratorios.size() - 1).getCodigoLaboratorio();
    }

    public LaboratorioBO obtenerLaboratorioPorCodigo(int codigoLaboratorio) {
        for (LaboratorioBO lab : laboratorios) {
            if (lab.getCodigoLaboratorio() == codigoLaboratorio) {
                return lab;
            }
        }
        return null; 
    }
}
