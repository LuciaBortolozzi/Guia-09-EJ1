package view;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controller.FrameMostrarDataAutoCtrl;

public class FrameMostrarDataAuto extends JFrame{
	
	private JFrame ventana = new JFrame("Datos de los autos");
    
	private JLabel labelAnioPatente = new JLabel("Anio patentamiento");
	private JTextField textAnioPatente = new JTextField(10);
	 
	private JLabel labelPatente = new JLabel("Patente");
    private JTextField textPatente = new JTextField(20);
    
   
    private JLabel labelPrecioAuto = new JLabel("Precio de compra");
    private JTextField textPrecioAuto = new JTextField(10);
    
    public FrameMostrarDataAuto(FrameMostrarDataAutoCtrl controlador) {
    	
    	ventana.setSize(300, 300);
        ventana.setLayout(new FlowLayout());
        
        ventana.add(labelPatente);
        ventana.add(textPatente);
        ventana.add(labelAnioPatente);
        ventana.add(textAnioPatente);
        ventana.add(labelPrecioAuto);
        ventana.add(textPrecioAuto);
        ventana.setVisible(true);
    	
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
    
    

}
