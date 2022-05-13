package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Modelo.*;
import Vista.*;

public class ControladorCRUD implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()== vistaCRUD.btnRegistrar) {
			int codigo= Integer.parseInt(vistaCRUD.txFcodigo.getText());
			String nombre= vistaCRUD.textFieldNombre.getText();
			String info= vistaCRUD.textFieldInfo.getText();
			String proveedor= vistaCRUD.textFieldProveedor.getText();
			double concentracion= Double.parseDouble(vistaCRUD.textFieldConcentracion.getText());
			int stock= Integer.parseInt(vistaCRUD.textFieldStock.getText());
			
			String rptaRegistro = modeloCRUD.insertMP(codigo, nombre, info, proveedor, concentracion, stock);
			
			if(rptaRegistro!=null) {
				JOptionPane.showMessageDialog(null, rptaRegistro);
			}else {
				JOptionPane.showMessageDialog(null, "Registro erroneo");
			}
		}
		if(e.getSource()== vistaCRUD.btnListar) {
			Llenartabla(vistaCRUD.tableMarco);
		}
			
		}
	JFCrud vistaCRUD =new JFCrud();
	
	MP_DAO modeloCRUD =new MP_DAO();
	
	public ControladorCRUD(JFCrud vistaCRUD, MP_DAO modeloCRUD) {
		this.vistaCRUD=vistaCRUD;
		this.modeloCRUD=modeloCRUD;
		
		vistaCRUD.btnRegistrar.addActionListener(this);
		vistaCRUD.btnListar.addActionListener(this);
		
	}
	public void InicializarCrud() {
		
	}
	public void Llenartabla(JTable tablaMarco) {
		DefaultTableModel modeloT=new DefaultTableModel();
		tablaMarco.setModel(modeloT);
		
		Object[] columna=new Object[5];
		
		int numeroRegistros=modeloCRUD.listaMP().size();
		
		for(int i=0;i<numeroRegistros; i++ ) {
			
			columna[0]=modeloCRUD.listaMP().get(i).getCodigo();
			columna[1]=modeloCRUD.listaMP().get(i).getNombre();
			columna[2]=modeloCRUD.listaMP().get(i).getInfo();
			columna[3]=modeloCRUD.listaMP().get(i).getProveedor();
			columna[4]=modeloCRUD.listaMP().get(i).getConcentracion();
			columna[5]=modeloCRUD.listaMP().get(i).getStock();
			
			modeloT.addRow(columna);
			
		}
		
		
	}
	

}
