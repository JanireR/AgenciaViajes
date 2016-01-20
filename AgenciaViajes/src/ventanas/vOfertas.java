/*Ventana de las ofertas disponibles 
 * */

package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


import clases.Ofertas;
import clases.Viajes;

public class vOfertas extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pnlTitulo;
	private JLabel etq;
	private JPanel pnlContenido;
	private JPanel pnlOfertas;
	private JPanel panelBotones;
	private JPanel pnlBotones;
	
	private JScrollPane scrlPanListaOfertas;
	private JList <Viajes> lstOfertas;
	private JList<Viajes> lstEstancias=new JList<Viajes>(new DefaultListModel<Viajes>());
	
	private JButton btnReservar = new JButton ("Reservar");
	private JButton btnSalir= new JButton("Salir");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vOfertas frame = new vOfertas();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null); //Centrar la ventana
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public vOfertas(){
		
		setTitle("Ofertas!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);		 
		this.setSize(700,250);
		ImageIcon icono= new ImageIcon("src/imagenes/vuelos.jpg");

	      this.setIconImage(icono.getImage());
		
		pnlTitulo = new JPanel();
		pnlTitulo.setForeground(Color.gray);
		FlowLayout fl_pnlTitulo = (FlowLayout) pnlTitulo.getLayout();
		fl_pnlTitulo.setAlignment(FlowLayout.CENTER);
		contentPane.add(pnlTitulo, BorderLayout.NORTH);
		
		etq = new JLabel ("Seleccione la mejor oferta");
		etq.setForeground(Color.BLACK);
		pnlTitulo.add(etq);

		pnlContenido = new JPanel();
		contentPane.add(pnlContenido, BorderLayout.CENTER);
		contentPane.setForeground(Color.gray);
		pnlContenido.setLayout(new GridLayout(1, 3, 10, 0));
		
		
		pnlOfertas = new JPanel();
		pnlContenido.add(pnlOfertas);
		pnlOfertas.setLayout(new BorderLayout(0, 0));
		
		scrlPanListaOfertas = new JScrollPane();
		pnlOfertas.add(scrlPanListaOfertas);
		
		lstOfertas = new JList<Viajes>();
		lstOfertas.setBackground(SystemColor.text);
		lstOfertas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lstOfertas.setModel(new DefaultListModel<Viajes>());
		scrlPanListaOfertas.setViewportView(lstOfertas);
		
		
		
		panelBotones = new JPanel();
		pnlContenido.add(panelBotones);
		panelBotones.setLayout(new FlowLayout(FlowLayout.RIGHT, 5, 5));
		
		
		pnlBotones = new JPanel();
		pnlBotones.setForeground(Color.gray);
		FlowLayout fl_pnlBotones = (FlowLayout) pnlBotones.getLayout();
		fl_pnlBotones.setAlignment(FlowLayout.RIGHT);
		contentPane.add(pnlBotones, BorderLayout.SOUTH);	
		pnlBotones.add(btnReservar);
		pnlBotones.add(btnSalir);		
		
	
		
		
		btnReservar.addActionListener(this);
		btnSalir.addActionListener(this);
		
		anyadirViajes();
	}

	private void anyadirViajes() {
		// TODO Auto-generated method stub
		Ofertas [] arrayOfertas = new Ofertas[10];
		
		arrayOfertas [0] = new Ofertas("023", "Londres", "Santander", "15/12/2015","20/12/2015");
		arrayOfertas [1] = new Ofertas("054", "Los Angeles", "New Zeland", "09/12/2015","19/12/2015");
		arrayOfertas [2] = new Ofertas("074", "Londres", "Santander", "07/12/2015","10/12/2015");
		arrayOfertas [3] = new Ofertas("013", "Fuerteventura", "Italia", "09/12/2015","19/12/2015");
		arrayOfertas [4] = new Ofertas("004", "Roma", "Malta", "18/12/2015","26/12/2015");
		arrayOfertas [5] = new Ofertas("040", "Malta", "Madrid", "16/12/2015","25/12/2015");
		
		
		for(Viajes v: arrayOfertas)
			((DefaultListModel<Viajes>) lstOfertas.getModel()).addElement(v);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		JButton botonPulsado = (JButton)arg0.getSource();
		
		if(botonPulsado == btnReservar){
			if(lstOfertas.getSelectedIndex()==-1){//no se ha seleccionado ninguna oferta
				JOptionPane.showMessageDialog(this, "Por favor, seleccione alguna oferta");
			}else{
				this.dispose();
				vUsuario reserva = new vUsuario();
				reserva.setVisible(true);
			}
		}else if (botonPulsado==btnSalir)
			this.dispose();
			vPrincipal principal= new vPrincipal();
			principal.setVisible(true);
	}
	
	

}
