package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFCrud extends JFrame {

	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFCrud frame = new JFCrud();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFCrud() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 30, 66, 14);
		contentPane.add(lblCodigo);
		
		txFcodigo = new JTextField();
		txFcodigo.setBounds(79, 27, 86, 20);
		contentPane.add(txFcodigo);
		txFcodigo.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 67, 46, 14);
		contentPane.add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(79, 64, 86, 20);
		contentPane.add(textFieldNombre);
		
		JLabel lblInfo = new JLabel("Informacion");
		lblInfo.setBounds(10, 104, 66, 14);
		contentPane.add(lblInfo);
		
		textFieldInfo = new JTextField();
		textFieldInfo.setColumns(10);
		textFieldInfo.setBounds(79, 101, 86, 20);
		contentPane.add(textFieldInfo);
		
		JLabel lblNewLabel_1 = new JLabel("Proveedor");
		lblNewLabel_1.setBounds(187, 30, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldProveedor = new JTextField();
		textFieldProveedor.setBounds(270, 27, 86, 20);
		contentPane.add(textFieldProveedor);
		textFieldProveedor.setColumns(10);
		
		JLabel lblConcentracion = new JLabel("Concentracion");
		lblConcentracion.setBounds(187, 67, 76, 14);
		contentPane.add(lblConcentracion);
		
		textFieldConcentracion = new JTextField();
		textFieldConcentracion.setColumns(10);
		textFieldConcentracion.setBounds(270, 64, 86, 20);
		contentPane.add(textFieldConcentracion);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setBounds(187, 104, 46, 14);
		contentPane.add(lblStock);
		
		textFieldStock = new JTextField();
		textFieldStock.setColumns(10);
		textFieldStock.setBounds(270, 101, 86, 20);
		contentPane.add(textFieldStock);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(410, 26, 89, 23);
		contentPane.add(btnRegistrar);
		
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEditar.setBounds(410, 63, 89, 23);
		contentPane.add(btnEditar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(410, 100, 89, 23);
		contentPane.add(btnEliminar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnListar.setBounds(410, 134, 89, 23);
		contentPane.add(btnListar);
		
		scrollPanedeTabla = new JScrollPane();
		scrollPanedeTabla.setBounds(24, 168, 506, 130);
		contentPane.add(scrollPanedeTabla);
		
		tableMarco = new JTable();
		tableMarco.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"CODIGO", "NOMBRE", "INFORMACION", "PROVEEDOR", "CONCENTRACION", "STOCK"
			}
		));
		tableMarco.getColumnModel().getColumn(2).setPreferredWidth(93);
		tableMarco.getColumnModel().getColumn(4).setPreferredWidth(103);
		scrollPanedeTabla.setViewportView(tableMarco);
	}
	public JPanel contentPane;
	public JTextField txFcodigo;
	public JTextField textFieldNombre;
	public JTextField textFieldInfo;
	public JTextField textFieldProveedor;
	public JTextField textFieldConcentracion;
	public JTextField textFieldStock;
	public JTable tableMarco;
	public JButton btnRegistrar;
	public JButton btnEditar;
	public JButton btnEliminar;
	public JButton btnListar;
	public JScrollPane scrollPanedeTabla;
}
