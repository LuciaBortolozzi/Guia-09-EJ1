package model.DAO;

import java.io.*;
import java.util.*;


import model.Autos;
import model.Modelos;

public class AutosDAO {

    //    private static final String directorio = "C:\\\\Users\\\\Flor\\\\git\\\\GUIA9-EJ1\\\\src\\\\resources\\";
    private static final String directorio = "D:\\\\IdeaProjects\\\\Guia-09-EJ1\\\\src\\\\resources\\";

    public static ArrayList<Autos> bajarAutosTXT(ArrayList<Modelos> modelo) {

        ArrayList<Autos> auto = new ArrayList<Autos>();
        try {
            File archivo = new File(directorio + "Autos.txt");
            if (archivo.exists()) {
                Scanner leerArchivoAutos = new Scanner(archivo);
                ArrayList<String> autosST = new ArrayList<String>();

                //Guardar contenido en String
                while (leerArchivoAutos.hasNext()) {
                    String lineaActual = leerArchivoAutos.nextLine();
                    autosST.add(lineaActual);
                }

                // Guardar objetos
                int i = 0;
                for (String s : autosST) {

                    auto.get(i).setPatente(s.substring(0, 8).toUpperCase());

                    int anio = Integer.parseInt(s.substring(18, 22));
                    auto.get(i).setAnioPatentamiento(anio);

                    auto.get(i).setPrecioCompra(Double.parseDouble(s.substring(22, 32)));

                    auto.get(i).setTipoCombustible(s.substring(32, 33).charAt(0));

                    auto.get(i).setEquipoMultimedia(Boolean.parseBoolean(s.substring(33, 38)));

                    auto.get(i).setAireAcondicionado(Boolean.parseBoolean(s.substring(38, 43)));

                    auto.get(i).setGps(Boolean.parseBoolean(s.substring(43, 48)));

                    int codigoMarca = Integer.parseInt(s.substring(8, 13));
                    int codigoModelo = Integer.parseInt(s.substring(13, 18));
                    agregarModeloMarca(auto, modelo, codigoMarca, codigoModelo, i);
                }

                leerArchivoAutos.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return auto;
    }


    public static void agregarModeloMarca(ArrayList<Autos> auto, ArrayList<Modelos> modelo, int codigoMarca, int codigoModelo, int i) {

        for (Modelos m : modelo) {

            if (codigoModelo == m.getCodigoModelo() && codigoMarca == m.getMarcas().getCodigoMarca()) {

                auto.get(i).setModelos(m);
                break;
            }
        }

    }

    public static void grabarAutosTXT(Autos auto) {

        try {
            FileWriter fichero = new FileWriter(directorio + "Autos.txt", true);

            PrintWriter archivoSalida = new PrintWriter(fichero);

            archivoSalida.println(String.format("%8s", auto.getPatente()) +
                    String.format("%5s", auto.getModelos().getMarcas().getCodigoMarca()) +
                    String.format("%5s", auto.getModelos().getCodigoModelo()) +
                    String.format("%4s", auto.getAnioPatentamiento()) +
                    String.format("%10s", auto.getPrecioCompra()) +
                    String.format("%1s", auto.getTipoCombustible()) +
                    String.format("%5s", auto.isEquipoMultimedia()) +
                    String.format("%5s", auto.isAireAcondicionado()) +
                    String.format("%5s", auto.isGps())
            );

            archivoSalida.close();

        } catch (IOException e3) {
            System.out.println("No se puede grabar el archivo de Autos.txt");
        }
    }
}