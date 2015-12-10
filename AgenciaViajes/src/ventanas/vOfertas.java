package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import clases.Viajes;

public class vOfertas extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel pnlTitulo;
	private JLabel etq;
	private JPanel pnlContenido;
	private JPanel pnlOfertas;
	private JScrollPane scrlPanListaOfertas;
	private JList <Viajes> lstOfertas;
	
	
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
		this.setSize(500,425);
		
		
		pnlTitulo = new JPanel();
		pnlTitulo.setBackground(new Color(175, 238, 238));
		FlowLayout fl_pnlTitulo = (FlowLayout) pnlTitulo.getLayout();
		fl_pnlTitulo.setAlignment(FlowLayout.LEFT);
		contentPane.add(pnlTitulo, BorderLayout.NORTH);
		
		etq = new JLabel ("Seleccione la mejor oferta");
		etq.setForeground(Color.BLACK);
		pnlTitulo.add(etq);

		pnlContenido = new JPanel();
		contentPane.add(pnlContenido, BorderLayout.CENTER);
		pnlContenido.setLayout(new GridLayout(0, 3, 0, 0));
		
		
		pnlOfertas = new JPanel();
		pnlContenido.add(pnlOfertas);
		pnlOfertas.setLayout(new BorderLayout(0, 0));
		
		scrlPanListaOfertas = new JScrollPane();
		pnlOfertas.add(scrlPanListaOfertas);
		
		
		//Seleccionar una sola oferta 
		
		insertarViajes();
	}

	private void insertarViajes() {
		// TODO Auto-generated method stub
		Viajes [] arrayViajes = new Viajes[10];
		
		arrayViajes [0] = new Viajes(023, "Londres", "Santander", "15/12/2015","20/12/2015");
		arrayViajes [1] = new Viajes(054, "Los Angeles", "New Zeland", "09/12/2015","19/12/2015");

	}
	
	

}
