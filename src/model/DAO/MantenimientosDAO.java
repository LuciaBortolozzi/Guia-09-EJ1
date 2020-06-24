package model.DAO;

import java.io.*;
import java.util.*;

import controller.AutosControlador;
import model.Autos;
import model.Reparaciones;
import view.Validaciones;

public class MantenimientosDAO {

    //    private static final String directorio = "C:\\\\Users\\\\Flor\\\\git\\\\Guia-09-EJ1\\\\src\\\\resources\\";
    private static final String directorio = "D:\\\\IdeaProjects\\\\Guia-09-EJ1\\\\src\\\\resources\\";

    public static void grabarMantenimientoTXT(Autos auto) {

        try {
            FileWriter fichero = new FileWriter(directorio + "Mantenimientos.txt", true);

            PrintWriter archivoSalida = new PrintWriter(fichero);

            archivoSalida.println(auto.getPatente() + ";" +
                    "P" + ";" +
                    auto.getMantenimientos().get(auto.getMantenimientos().size() - 1).getFechaMantenimiento().get(Calendar.YEAR) +
                    (auto.getMantenimientos().get(auto.getMantenimientos().size() - 1).getFechaMantenimiento().get(Calendar.MONTH) + 1) +
                    auto.getMantenimientos().get(auto.getMantenimientos().size() - 1).getFechaMantenimiento().get(Calendar.DAY_OF_MONTH) +
                    ";" +
                    auto.getMantenimientos().get(auto.getMantenimientos().size() - 1).getCostoMantenimiento()
            );

            archivoSalida.close();

        } catch (IOException e) {
            System.out.println("No se puede grabar el archivo de Mantenimientos.txt");
        }
    }

    public static void grabarReparacionesTXT(Autos auto) {

        try {
            FileWriter fichero = new FileWriter(directorio + "Mantenimientos.txt", true);

            PrintWriter archivoSalida = new PrintWriter(fichero);

            archivoSalida.println(auto.getPatente() + ";" +
                    "R" + ";" +
                    auto.getMantenimientos().get(auto.getMantenimientos().size() - 1).getFechaMantenimiento().get(Calendar.YEAR) +
                    (auto.getMantenimientos().get(auto.getMantenimientos().size() - 1).getFechaMantenimiento().get(Calendar.MONTH) + 1) +
                    auto.getMantenimientos().get(auto.getMantenimientos().size() - 1).getFechaMantenimiento().get(Calendar.DAY_OF_MONTH) +
                    ";" +
                    auto.getMantenimientos().get(auto.getMantenimientos().size() - 1).getCostoMantenimiento() + ";" +
                    ((Reparaciones) auto.getMantenimientos().get(auto.getMantenimientos().size() - 1)).getPartes()
            );

            archivoSalida.close();

        } catch (IOException e) {
            System.out.println("No se puede grabar el archivo de Mantenimientos.txt");
        }
    }

 /*   public static ArrayList<Autos> bajarMantenimientosTXT(ArrayList<Autos> autos) {

        try {
            File archivo = new File(directorio + "Mantenimientos.txt");
            if (archivo.exists()) {
                Scanner leerArchivoMantenimientos = new Scanner(archivo);
                ArrayList<String> mantenimientosST = new ArrayList<String>();

                //Guardar contenido en String
                while (leerArchivoMantenimientos.hasNext()) {
                    String lineaActual = leerArchivoMantenimientos.nextLine();
                    mantenimientosST.add(lineaActual);
                }

                // Guardar objetos
                int i = 0;
                for (String m : mantenimientosST) {

                    String[] mantenimientoST = m.split(";");

                    String patente = mantenimientoST[0];

                    char tipoMantenimiento = (mantenimientoST[1]).charAt(0);

                    String fecha = mantenimientoST[2];
                    Calendar fechaMantenimiento = Calendar.getInstance();
                    fechaMantenimiento = Validaciones.convertirAFechaCalendar(fecha);

                    double costo = Double.parseDouble(mantenimientoST[3]);

                    String partes = null;
                    if (tipoMantenimiento == 'R') {

                        partes = mantenimientoST[4];
                    }

                    Autos auto = AutosControlador.buscarAuto(patente, autos);

                    if (auto != null) {

                        if (tipoMantenimiento != 'R') {

                            auto.setMantenimientos(fechaMantenimiento, costo);
                        } else {

                            auto.setMantenimientos(fechaMantenimiento, costo, partes);
                        }
                    }
                }

                leerArchivoMantenimientos.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return autos;
    }*/



}
