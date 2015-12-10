package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import clases.BD;
import clases.Viajes;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;




public class vInformeViajes extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;  // Para serialización
	
	JButton btnAadirViaje = new JButton("A\u00F1adir viaje");

	private JPanel contentPane;
	static BD bd;
	JButton btnSalir = new JButton("Salir");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vInformeViajes ventanaInformes = new vInformeViajes();
					ventanaInformes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		bd = new BD();
		bd.initBD("bd.sqlite");
		try{
			FileInputStream fis = new FileInputStream("viajes.sql");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
		}catch(FileNotFoundException e){
			System.out.print("El fichero no existe");
			
			
		}
	}

	/**
	 * Create the frame.
	 */
	public vInformeViajes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAadirViaje.setBounds(208, 11, 116, 23);
		contentPane.add(btnAadirViaje);
		
		btnSalir.setBounds(355, 11, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblInformeViajes = new JLabel("Informe Viajes");
		lblInformeViajes.setBounds(0, 0, 105, 14);
		contentPane.add(lblInformeViajes);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(86, 70, 46, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(192, 67, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCiudadOrigen = new JLabel("Ciudad Origen");
		lblCiudadOrigen.setBounds(86, 115, 83, 14);
		contentPane.add(lblCiudadOrigen);
		
		textField_1 = new JTextField();
		textField_1.setBounds(192, 112, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCiudadDestino = new JLabel("Ciudad Destino");
		lblCiudadDestino.setBounds(82, 168, 98, 14);
		contentPane.add(lblCiudadDestino);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(192, 165, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblFechaInicio = new JLabel("Fecha Entrada");
		lblFechaInicio.setBounds(86, 209, 83, 14);
		contentPane.add(lblFechaInicio);
		
		JLabel lblFechaSalida = new JLabel("Fecha Salida");
		lblFechaSalida.setBounds(86, 254, 72, 14);
		contentPane.add(lblFechaSalida);
		
		textField_3 = new JTextField();
		textField_3.setBounds(192, 206, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(192, 251, 86, 20);
		contentPane.add(textField_4);
		
		JList listaViajes = new JList();
		listaViajes.setBounds(10, 40, 60, 237);
		contentPane.add(listaViajes);

		btnAadirViaje.addActionListener(this);
		btnSalir.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton botonPulsado = (JButton)e.getSource();
		
		if(botonPulsado == btnAadirViaje){
			try
			{
				FileInputStream fis=new FileInputStream("viajes.sql");
				ObjectInputStream ois=new ObjectInputStream(fis);
				Vector<Viajes> v=new Vector<Viajes>();
				Viajes vi = null;
				try{
					vi = (Viajes)ois.readObject();
				}catch (Exception e0){
					v=null;
				}
				while(vi!=null)
				{
					v.add(vi);
					try
					{
						vi=(Viajes)ois.readObject();
					}
					catch(Exception e1)
					{
						vi=null;
					}
				}
				ois.close();
				FileOutputStream fos=new FileOutputStream("viajes.sql");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				Viajes nuevo = new Viajes(); //meter parametros de Viajes
				v.add(nuevo);
				for(int i=0;i<v.size();i++)
					oos.writeObject(v.elementAt(i));
				oos.writeObject(null);
				oos.close();
				JOptionPane.showMessageDialog(this, "Viaje añadido");
			}
			catch(Exception ex)
			{
				System.out.print(ex.toString());  //"Error al tratar el fichero";
			}
			
			}else if(botonPulsado == btnSalir){
				this.dispose();
				vPrincipal principal= new vPrincipal();
				principal.setVisible(true);
			}
		}
	}
