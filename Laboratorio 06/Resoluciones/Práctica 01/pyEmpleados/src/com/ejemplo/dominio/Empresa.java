package com.ejemplo.dominio;

/**
 *
 * @author MARTIN
 */
public class Empresa {

    private String cuit;
    private String razonSocial;
    private Empleado[] trabajadores;

    private static final int CANT_EMP = 30;

    public Empresa() {
        cuit = "Sin definir";
        razonSocial = "Sin definir";
        trabajadores = new Empleado[CANT_EMP];
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public boolean agregarTrabajador(Empleado t) {
        boolean aux = false;
        for (int i = 0; i < trabajadores.length; i++) {
            if (trabajadores[i] == null) {
                trabajadores[i] = t;
                aux = true;
                break;
            }
        }
        return aux;
    }

    public String mostrarNomina() {
        String aux = "Nómina de trabajadores:\n";
        ordenar();
        for (Empleado t : trabajadores) {
            if (t != null) {
                aux += t.toString() + "\n";
            }
        }
        return aux;
    }

    public void incrementarSueldo(float porc) {
        for (Empleado t : trabajadores) {
            if (t != null && t instanceof TrabajadorFijo) {
                TrabajadorFijo e = (TrabajadorFijo) t;
                float sueldoInc = e.getSueldo() + (porc / 100) * e.getSueldo();
                e.setSueldo(sueldoInc);
            }
        }
    }

    public float presupuestoMensual() {
        float total = 0;
        for (Empleado e : trabajadores) {
            total += e.calcularSueldo();
        }
        return total;
    }

    private void ordenar() {
        //Ordenar arreglo
        int n = trabajadores.length;
        Empleado e = null;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (trabajadores[i] != null && trabajadores[j] != null) {
                    if (trabajadores[i].getNombre().compareTo(trabajadores[j].getNombre()) > 0) {
                        e = trabajadores[i];
                        trabajadores[i] = trabajadores[j];
                        trabajadores[j] = e;
                    }
                }
            }
        }
    }
}
