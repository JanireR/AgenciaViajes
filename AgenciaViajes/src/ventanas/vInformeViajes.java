/*Ventana donde estan guardados 10 viajes y aparecerán todos sus datos al pinchar en mostrar Datos
 * En caso de querer editar algun campo de un viaje, se mostraran los datos y pinchando en 'Editar' se hace,
 * cuando se pulsa en este boton, el boton 'OK' se habilitará, y después de cambiar algún dato,se pulsará en dicho
 * botón para terminar con los cambios
 * */
package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;



import clases.BD;
import clases.Viajes;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;




public class vInformeViajes extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;  // Para serialización
	
	//JButton btnAadirViaje = new JButton("A\u00F1adir");
	JButton btnEditar = new JButton("Editar");
	//JButton btnEliminar = new JButton("Eliminar");
	JButton btnReservar = new JButton("Reservar");
	JButton btnOfertas = new JButton("");
	JButton btnMostrarDatos = new JButton("Mostrar Datos");
	private final JTextPane textDatos = new JTextPane();
	
	private JPanel contentPane;
	static BD bd;
	JButton btnSalir = new JButton("Salir");
	JButton btnOK = new JButton("OK");
	private JList<?> listaViajes;

	//Crear array de viajes 
	Viajes arrayviajes[]= new Viajes[10];
	String viajesid[]= new String[10];
	

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
		
//		bd = new BD();
//		
//		bd.initBD("reservas.sqlite");
//		
	}

	/**
	 * Create the frame.
	 */
	public vInformeViajes() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon icono= new ImageIcon("src/imagenes/vuelos.jpg");
		this.setIconImage(icono.getImage());
		
		
		//cargar los datos de los viajes
		
		arrayviajes[0]= new Viajes("001","Bilbao","Madrid","02/12/2015","17/12/2015");
		arrayviajes[1]= new Viajes("002","Madrid","Barcelona","03/12/2015", "09/12/2015");
		arrayviajes[2]= new Viajes("003","Londres","Barcelona","05/12/2015","09/12/2015");
		arrayviajes[3]= new Viajes("004","Bilbao","Londres", "10/12/2015","14/12/2015");
		arrayviajes[4]= new Viajes("005","Bilbao","Sevilla", "09/12/2015","15/12/2015");
		arrayviajes[5]= new Viajes("006","Madrid","Roma","04/12/2015","10/12/2015");
		arrayviajes[6]= new Viajes("007","Roma","Bilbao","25/12/2015","28/12/2015");
		arrayviajes[7]= new Viajes("008","Barcelona","Sevilla","20/12/2015","26/12/2015");
		arrayviajes[8]= new Viajes("009","Sevilla","Roma","24/12/2015","30/12/2015");
		arrayviajes[9]= new Viajes("010","Londres","Madrid","19/12/2015","25/12/2015");
		
		
		
		for(int j=0; j< viajesid.length;j++){
			viajesid[j]= arrayviajes[j].getId();
			listaViajes= new JList<Object>(viajesid);
		}
		
	
		JScrollPane pane = new JScrollPane(listaViajes);
		DefaultListSelectionModel m = new DefaultListSelectionModel();
	
			
//		btnAadirViaje.setBounds(329, 92, 89, 23);
//		contentPane.add(btnAadirViaje);
		
		btnSalir.setBounds(287, 238, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblInformeViajes = new JLabel("Informe Viajes");
		lblInformeViajes.setBounds(0, 0, 105, 14);
		contentPane.add(lblInformeViajes);
		
		
		listaViajes.setBounds(10, 40, 60, 237);
		contentPane.add(listaViajes);
		
		
		btnEditar.setBounds(329, 46, 89, 23);
		contentPane.add(btnEditar);
		
		
//		btnEliminar.setBounds(329, 137, 89, 23);
//		contentPane.add(btnEliminar);
		
		btnReservar.setBounds(151, 238, 89, 23);
		contentPane.add(btnReservar);
		btnOfertas.setIcon(new ImageIcon(vInformeViajes.class.getResource("/imagenes/ofertas.jpg")));
		
		
		btnOfertas.setBounds(308, 136, 141, 47);
		contentPane.add(btnOfertas);
		
		
		btnMostrarDatos.setBounds(105, 25, 137, 31);
		contentPane.add(btnMostrarDatos);
		textDatos.setBounds(101, 80, 172, 118);
		
		contentPane.add(textDatos);
		
		
		btnOK.setBounds(434, 46, 51, 23);
		contentPane.add(btnOK);
		btnOK.setEnabled(false);
		
		

		//btnAadirViaje.addActionListener(this);
		btnSalir.addActionListener(this);
		btnEditar.addActionListener(this);
		//btnEliminar.addActionListener(this);
		btnReservar.addActionListener(this);
		btnOfertas.addActionListener(this);
		btnMostrarDatos.addActionListener(this);
		btnOK.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton botonPulsado = (JButton)e.getSource();
		String datos;
//		if(botonPulsado == btnAadirViaje){
//			}
			if(botonPulsado == btnSalir){
				this.dispose();
				vPrincipal principal= new vPrincipal();
				principal.setVisible(true);
			}else if(botonPulsado == btnEditar){ //Cuando se pulse el botón editar, se activará el 'OK'
				textDatos.setEditable(true);
				btnOK.setEnabled(true);
			}else if(botonPulsado==btnOK){				
				datos=textDatos.getText();
				textDatos.setText(datos);
				System.out.println("datos cambiados" + datos);
				for(int i=0; i<arrayviajes.length;i++){
					if(arrayviajes[i].getId().equals(listaViajes.getSelectedValue())){
						
					}
				}
//			}else if (botonPulsado == btnEliminar){
//				 }
			}else if (botonPulsado == btnReservar){
				this.dispose();
				vUsuario usuario = new vUsuario();
				usuario.setVisible(true);
			}else if(botonPulsado == btnOfertas){
				this.dispose();
				vOfertas ofertas = new vOfertas();
				ofertas.setVisible(true);
			}else if(botonPulsado==btnMostrarDatos){
				for(int i=0; i<arrayviajes.length;i++){
					if(arrayviajes[i].getId().equals(listaViajes.getSelectedValue())){
						System.out.println(arrayviajes[i].toString());
						textDatos.setText(arrayviajes[i].toString());
						textDatos.setEditable(false);
					}
				}
			}
		}
	}
