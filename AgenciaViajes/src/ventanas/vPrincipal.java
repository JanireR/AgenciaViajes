/*Ventana principal donde se podra acceder como Usuario(sin identificarse) o como Admin (con usuario y contraseña)
 * */
package ventanas;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class vPrincipal extends JFrame implements ActionListener{
	
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem m1, m2;
	private JPanel contentPane;	
	private JLabel lblViajes;
	
	
	public vPrincipal(){
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		contentPane = new JPanel();contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLayout(null);
		
		JLabel lblViajes = new JLabel("");
		lblViajes.setIcon(new ImageIcon("H:\\1º cuatri\\Prog III\\git\\agenciaViajes\\AgenciaViajes\\src\\imagenes\\vuelos.jpg"));
		lblViajes.setBounds(0, 0, 425, 200);
		
		
        mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Acceder");
        mb.add(menu1);
        m1=new JMenuItem("Usuario");
        m1.addActionListener(this);
        menu1.add(m1);
        m2=new JMenuItem("Admin");
        m2.addActionListener(this);
        menu1.add(m2);
        
        ImageIcon icono= new ImageIcon("src/imagenes/vuelos.jpg");

        
        this.setIconImage(icono.getImage());
		
		
		contentPane.add(lblViajes); 
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vPrincipal frame = new vPrincipal();
					frame.setVisible(true);
					frame.setBounds(90,10,437,270);
					frame.setLocationRelativeTo(null); //Centrar la ventana
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Container f=this.getContentPane();
        if (e.getSource()==m1) {
        	vInformeViajesUsuario informe = new vInformeViajesUsuario();
       	 	informe.setVisible(true);
        }
        if (e.getSource()==m2) {
        	vAdmin admin = new vAdmin();
            admin.setVisible(true);
        	 
        }
           
	}

}
