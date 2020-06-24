package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.FrameMenuCtrl;

public class FrameMenu extends JFrame {

    JMenuItem opcion1 = new JMenuItem("Auto");
    JMenuItem opcion2 = new JMenuItem("Mantenimiento");
    JMenuItem opcion3 = new JMenuItem("Info auto");
    JMenuItem opcion4 = new JMenuItem("Version");
    JMenuItem opcion5 = new JMenuItem("Salir");
    private FrameMenuCtrl FMControlador;

    public FrameMenu(FrameMenuCtrl FMControlador) {

        this.FMControlador = FMControlador;
        this.FMControlador.setFrameMenu(this);

        this.setTitle("MENU PRINCIPAL");

        JMenu solapaAgregar = new JMenu("Agregar");
        opcion1.addActionListener(FMControlador);
        opcion2.addActionListener(FMControlador);

        solapaAgregar.add(opcion1);
        solapaAgregar.add(opcion2);

        JMenu solapaInfoAuto = new JMenu("Informacion");
        opcion3.addActionListener(FMControlador);

        solapaInfoAuto.add(opcion3);

        JMenu solapaAyuda = new JMenu("Ayuda");
        opcion4.addActionListener(FMControlador);
        opcion5.addActionListener(FMControlador);

        solapaAyuda.add(opcion4);
        solapaAyuda.add(opcion5);

        opcion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "AutosMekanik: Todos los mantenimientos\n" +
                                "Versión 1.0\n" +
                                "2020 - Schmidt y Bortolozzi", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        opcion5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea salir de la aplicación?",
                        "Confirmación", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        JMenuBar barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        barraMenu.add(solapaAgregar);
        barraMenu.add(solapaInfoAuto);
        barraMenu.add(solapaAyuda);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public JMenuItem getOpcion1() {
        return opcion1;
    }

    public JMenuItem getOpcion2() {
        return opcion2;
    }

    public JMenuItem getOpcion3() {
        return opcion3;
    }

    public JMenuItem getOpcion4() {
        return opcion4;
    }

    public JMenuItem getOpcion5() {
        return opcion5;
    }

}
