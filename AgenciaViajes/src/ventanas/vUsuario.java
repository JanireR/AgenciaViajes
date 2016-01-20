/*Ventana final para terminar con la reserva donde deberá introducir datos personales
 * */
package ventanas;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import clases.Usuario;

public class vUsuario extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JButton btnReservar = new JButton("Reservar");
	JButton btnSalir = new JButton("Salir");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vUsuario frame = new vUsuario();
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
	public vUsuario() {
		
		this.setTitle("Realizar reserva:");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon icono= new ImageIcon("src/imagenes/vuelos.jpg");
		this.setIconImage(icono.getImage());
		
		this.getContentPane().setBackground(new Color(176, 224, 230));
		
		JLabel lblDatosDelPasajero = new JLabel("Datos del Pasajero:");
		lblDatosDelPasajero.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDatosDelPasajero.setBounds(33, 11, 174, 24);
		contentPane.add(lblDatosDelPasajero);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNombre.setBounds(33, 65, 65, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(33, 90, 126, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblApellidos.setBounds(199, 65, 84, 14);
		contentPane.add(lblApellidos);
				
		textField_1 = new JTextField();
		textField_1.setBounds(197, 90, 126, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDni = new JLabel("Direccion:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDni.setBounds(33, 162, 126, 14);
		contentPane.add(lblDni);
		
		textField_2 = new JTextField();
		textField_2.setBounds(33, 189, 126, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Telefono:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(196, 163, 87, 14);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(197, 189, 126, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblProvincia.setBounds(353, 66, 84, 14);
		contentPane.add(lblProvincia);
		
		textField_4 = new JTextField();
		textField_4.setBounds(353, 90, 114, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		
		btnReservar.setForeground(Color.DARK_GRAY);
		btnReservar.setBounds(102, 269, 105, 23);
		contentPane.add(btnReservar);
				
		btnSalir.setForeground(Color.DARK_GRAY);
		btnSalir.setBounds(267, 269, 89, 23);
		contentPane.add(btnSalir);
		
		btnReservar.addActionListener(this);
		btnSalir.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton botonPulsado = (JButton)e.getSource();
		if(botonPulsado==btnReservar)
		{
			try
			{
				FileInputStream fis=new FileInputStream("Reservas.dat");
				ObjectInputStream ois=new ObjectInputStream(fis);
				Vector<Usuario> v=new Vector<Usuario>();
				Usuario u;
				try
				{
					u=(Usuario)ois.readObject();
				}
				catch(Exception e0)
				{
					u=null;
				}
				while(u!=null)
				{
					v.add(u);
					try
					{
						u=(Usuario)ois.readObject();
					}
					catch(Exception e1)
					{
						u=null;
					}
				}
				ois.close();
				FileOutputStream fos=new FileOutputStream("Reservas.dat");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				Usuario nueva=new Usuario(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText());
				v.add(nueva);
				for(int i=0;i<v.size();i++)
					oos.writeObject(v.elementAt(i));
				oos.writeObject(null);
				oos.close();
				JOptionPane.showMessageDialog(this, "Reserva realizada con éxito");
				
				
			}
			catch(Exception ex)
			{
				System.out.print(ex.toString());//"Error al tratar el fichero";
			}
			
		}
		else if(botonPulsado==btnSalir)
		{
			this.dispose();
			vPrincipal principal= new vPrincipal();
			principal.setVisible(true);
		}
	}
	}

