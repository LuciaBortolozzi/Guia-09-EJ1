package view;

import controller.FrameAgregarAutoCtrl;
import controller.FrameMostrarAutoCtrl;

import javax.swing.*;
import java.awt.*;

public class FrameMostrarAuto extends JFrame {

    private JFrame ventana = new JFrame("Visualizar autos");
    private JLabel labelPatente = new JLabel("Ingresar patente");
    private JTextField textPatente = new JTextField(20);
    private JButton buttonConsultar = new JButton("Consultar");

    private String informacion;

    public FrameMostrarAuto(FrameMostrarAutoCtrl controlador) {
        ventana.setSize(300, 500);
        ventana.setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        buttonConsultar.addActionListener(controlador);

        ventana.add(labelPatente);
        ventana.add(textPatente);
        ventana.add(buttonConsultar);
        ventana.setVisible(true);

        if(buttonConsultar.isSelected()) {
        	JOptionPane.showMessageDialog(null,
                    informacion +
                            " ", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        	
        }
        
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JLabel getLabelPatente() {
        return labelPatente;
    }

    public void setLabelPatente(JLabel labelPatente) {
        this.labelPatente = labelPatente;
    }

    public JTextField getTextPatente() {
        return textPatente;
    }

    public void setTextPatente(JTextField textPatente) {
        this.textPatente = textPatente;
    }

    public JButton getButtonConsultar() {
        return buttonConsultar;
    }

    public void setButtonConsultar(JButton buttonConsultar) {
        this.buttonConsultar = buttonConsultar;
    }

}
