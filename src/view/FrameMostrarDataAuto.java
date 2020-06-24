package view;

import java.awt.FlowLayout;

import javax.swing.*;

import controller.FrameMostrarDataAutoCtrl;

public class FrameMostrarDataAuto extends JFrame {

    private JFrame ventana = new JFrame("Datos de los autos");

    private JLabel labelAnioPatente = new JLabel("Anio patentamiento");
    private JTextField textAnioPatente = new JTextField(10);

    private JLabel labelPatente = new JLabel("Patente");
    private JTextField textPatente = new JTextField(20);

    private JLabel labelPrecioAuto = new JLabel("Precio de compra");
    private JTextField textPrecioAuto = new JTextField(10);

    private JLabel labelPrecioTotal = new JLabel("Precio total");
    private JTextField textPrecioTotal = new JTextField(10);

    private JLabel labelFechaDeMantenimiento = new JLabel("Fecha del mantenimiento de mayor importe");
    private JTextField textFechaDeMantenimiento = new JTextField(10);

    private JLabel labelCostoMantenimiento = new JLabel("Costo del mantenimiento de mayor importe");
    private JTextField textCostoMantenimiento = new JTextField(10);

    public FrameMostrarDataAuto(FrameMostrarDataAutoCtrl controlador) {

        ventana.setSize(300, 300);
        ventana.setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        ventana.add(labelPatente);
        ventana.add(textPatente);
        ventana.add(labelAnioPatente);
        ventana.add(textAnioPatente);
        ventana.add(labelPrecioAuto);
        ventana.add(textPrecioAuto);
        ventana.add(labelPrecioTotal);
        ventana.add(textPrecioTotal);
        ventana.add(labelFechaDeMantenimiento);
        ventana.add(textFechaDeMantenimiento);
        ventana.add(labelCostoMantenimiento);
        ventana.add(textCostoMantenimiento);
        ventana.setVisible(true);

        textAnioPatente.setEditable(false);
        textPatente.setEditable(false);
        textPrecioAuto.setEditable(false);
        textPrecioTotal.setEditable(false);
        textFechaDeMantenimiento.setEditable(false);
        textCostoMantenimiento.setEditable(false);
    }

    public JFrame getVentana() {
        return ventana;
    }

    public void setVentana(JFrame ventana) {
        this.ventana = ventana;
    }

    public JLabel getLabelAnioPatente() {
        return labelAnioPatente;
    }

    public void setLabelAnioPatente(JLabel labelAnioPatente) {
        this.labelAnioPatente = labelAnioPatente;
    }

    public JTextField getTextAnioPatente() {
        return textAnioPatente;
    }

    public void setTextAnioPatente(JTextField textAnioPatente) {
        this.textAnioPatente = textAnioPatente;
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

    public JLabel getLabelPrecioAuto() {
        return labelPrecioAuto;
    }

    public void setLabelPrecioAuto(JLabel labelPrecioAuto) {
        this.labelPrecioAuto = labelPrecioAuto;
    }

    public JTextField getTextPrecioAuto() {
        return textPrecioAuto;
    }

    public void setTextPrecioAuto(JTextField textPrecioAuto) {
        this.textPrecioAuto = textPrecioAuto;
    }

    public JLabel getLabelPrecioTotal() {
        return labelPrecioTotal;
    }

    public void setLabelPrecioTotal(JLabel labelPrecioTotal) {
        this.labelPrecioTotal = labelPrecioTotal;
    }

    public JTextField getTextPrecioTotal() {
        return textPrecioTotal;
    }

    public void setTextPrecioTotal(JTextField textPrecioTotal) {
        this.textPrecioTotal = textPrecioTotal;
    }

    public JLabel getLabelFechaDeMantenimiento() {
        return labelFechaDeMantenimiento;
    }

    public void setLabelFechaDeMantenimiento(JLabel labelFechaDeMantenimiento) {
        this.labelFechaDeMantenimiento = labelFechaDeMantenimiento;
    }

    public JTextField getTextFechaDeMantenimiento() {
        return textFechaDeMantenimiento;
    }

    public void setTextFechaDeMantenimiento(JTextField textFechaDeMantenimiento) {
        this.textFechaDeMantenimiento = textFechaDeMantenimiento;
    }

    public JLabel getLabelCostoMantenimiento() {
        return labelCostoMantenimiento;
    }

    public void setLabelCostoMantenimiento(JLabel labelCostoMantenimiento) {
        this.labelCostoMantenimiento = labelCostoMantenimiento;
    }

    public JTextField getTextCostoMantenimiento() {
        return textCostoMantenimiento;
    }

    public void setTextCostoMantenimiento(JTextField textCostoMantenimiento) {
        this.textCostoMantenimiento = textCostoMantenimiento;
    }

}
