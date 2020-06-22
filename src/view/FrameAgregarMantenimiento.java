package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.FrameAgregarMantCtrl;

public class FrameAgregarMantenimiento extends JFrame {

    private JFrame ventana = new JFrame("Ingreso del mantenimiento");
    private JTextArea textArea = new JTextArea("Complete con los datos del mantenimiento");
    private JLabel labelPatente = new JLabel("Patente");
    private JTextField textPatente = new JTextField(20);
    private JRadioButton radioButtonReparacion = new JRadioButton("Reparacion");
    private JRadioButton radioButtonPreventivo = new JRadioButton("Preventivo");
    private ButtonGroup groupTipoMantenimiento = new ButtonGroup();
    private JLabel labelCosto = new JLabel("Costo");
    private JTextField textCosto = new JTextField(10);
    private JLabel labelComentario = new JLabel("Partes y costo");
    private JTextField textComentario = new JTextField(40);
    private JButton buttonAgregar = new JButton("Agregar");
    private JButton buttonLimpiar = new JButton("Limpiar");

    public FrameAgregarMantenimiento(FrameAgregarMantCtrl controlador) {

        ventana.setSize(500, 500);
        ventana.setLayout(new FlowLayout());

        buttonLimpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                limpiar(true);
            }
        });

        buttonAgregar.addActionListener(controlador);

        textArea.setEditable(false);
        ventana.add(textArea);
        ventana.add(labelPatente);
        ventana.add(textPatente);
        groupTipoMantenimiento.add(radioButtonReparacion);
        groupTipoMantenimiento.add(radioButtonPreventivo);
        radioButtonReparacion.setSelected(false);
        ventana.add(radioButtonReparacion);
        ventana.add(radioButtonPreventivo);
        ventana.add(labelCosto);
        ventana.add(textCosto);

        ventana.add(labelComentario);
        ventana.add(textComentario);

        ItemListener itemListener = new ItemListener() {

            public void itemStateChanged(ItemEvent e){

                if (radioButtonReparacion.isSelected()){
                    if (e.getStateChange() ==  ItemEvent.SELECTED) {
                        labelComentario.setVisible(true);
                        textComentario.setVisible(true);
                    }
                } else {
                    labelComentario.setVisible(false);
                    textComentario.setVisible(false);
                }
            }
        };
        radioButtonReparacion.addItemListener(itemListener);

        ventana.add(buttonAgregar);
        ventana.add(buttonLimpiar);
        ventana.setVisible(true);
    }

    public void limpiar(boolean conf) {
        int rta = !(conf) ? 0 : (JOptionPane.showConfirmDialog(null, "Los datos no fueron guardados. Confirma?", "Confirmacion", JOptionPane.YES_NO_OPTION));
        if (rta == JOptionPane.YES_OPTION) {
            textPatente.setText("");
            radioButtonReparacion.setSelected(false);
            radioButtonPreventivo.setSelected(true);
            textCosto.setText("");
            textComentario.setText("");
            labelComentario.setVisible(false);
            textComentario.setVisible(false);
        }
    }


    public JFrame getVentana() {
        return ventana;
    }


    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }


    public JTextArea getTextArea() {
        return textArea;
    }


    public void setTextArea(JTextArea textArea) {
        this.textArea = textArea;
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


    public JRadioButton getRadioButtonReparacion() {
        return radioButtonReparacion;
    }


    public void setRadioButtonReparacion(JRadioButton radioButtonReparacion) {
        this.radioButtonReparacion = radioButtonReparacion;
    }


    public JRadioButton getRadioButtonPreventivo() {
        return radioButtonPreventivo;
    }


    public void setRadioButtonPreventivo(JRadioButton radioButtonPreventivo) {
        this.radioButtonPreventivo = radioButtonPreventivo;
    }


    public ButtonGroup getGroupTipoMantenimiento() {
        return groupTipoMantenimiento;
    }


    public void setGroupTipoMantenimiento(ButtonGroup groupTipoMantenimiento) {
        this.groupTipoMantenimiento = groupTipoMantenimiento;
    }


    public JLabel getLabelCosto() {
        return labelCosto;
    }


    public void setLabelCosto(JLabel labelCosto) {
        this.labelCosto = labelCosto;
    }


    public JTextField getTextCosto() {
        return textCosto;
    }


    public void setTextCosto(JTextField textCosto) {
        this.textCosto = textCosto;
    }


    public JLabel getLabelComentario() {
        return labelComentario;
    }


    public void setLabelComentario(JLabel labelComentario) {
        this.labelComentario = labelComentario;
    }


    public JTextField getTextComentario() {
        return textComentario;
    }


    public void setTextComentario(JTextField textComentario) {
        this.textComentario = textComentario;
    }


    public JButton getButtonAgregar() {
        return buttonAgregar;
    }


    public void setButtonAgregar(JButton buttonAgregar) {
        this.buttonAgregar = buttonAgregar;
    }


    public JButton getButtonLimpiar() {
        return buttonLimpiar;
    }


    public void setButtonLimpiar(JButton buttonLimpiar) {
        this.buttonLimpiar = buttonLimpiar;
    }


}
