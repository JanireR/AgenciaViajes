/*Venta de Administrador donde el usuario es: 'admin' y la contraseña es : 'pass'
 * En caso de insertar mal los datos, saldra un mensaje de error
 * */


package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class vAdmin extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnAceptar = new JButton("Aceptar");
	private JButton btnCancelar = new JButton("Cancelar");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vAdmin frame = new vAdmin();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null); //Centrar la ventana
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 ImageIcon icono= new ImageIcon("src/imagenes/vuelos.jpg");
	        
	        this.setIconImage(icono.getImage());
		
		JLabel lblBienvenido = new JLabel("\u00A1Bienvenido! ");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblBienvenido.setBounds(94, 11, 235, 50);
		contentPane.add(lblBienvenido);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(vAdmin.class.getResource("/imagenes/login.jpg")));
		lblNewLabel.setBounds(10, 57, 206, 141);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(237, 68, 92, 14);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(306, 65, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(237, 116, 86, 14);
		contentPane.add(lblContrasea);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(306, 113, 86, 20);
		contentPane.add(passwordField);
		
		
		btnAceptar.setBounds(226, 169, 89, 23);
		contentPane.add(btnAceptar);
		
		
		btnCancelar.setBounds(335, 169, 89, 23);
		contentPane.add(btnCancelar);
		this.setTitle("Acceso al sistema");
		
		btnAceptar.addActionListener(this);
		btnCancelar.addActionListener(this);
	}
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton botonPulsado = (JButton)e.getSource();
		
		if (botonPulsado==btnAceptar){
			String usuario, pass;
			pass =passwordField.getText();
			usuario = textField.getText();
			if(usuario.equalsIgnoreCase("admin") &&  pass.equals("pass")){	
				if(botonPulsado==btnAceptar){
					this.dispose();
					vInformeViajes informeViajes = new vInformeViajes();
					informeViajes.setVisible(true);
				}
			}else{
				
					JOptionPane.showMessageDialog(this, "El usuario o la contraseña son incorrectas");
				
			}
		}
		
			
		}
	
	
	
		
	}

