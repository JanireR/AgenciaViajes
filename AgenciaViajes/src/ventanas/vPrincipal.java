/*poner imagen principal
 * */
package ventanas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class vPrincipal extends JFrame implements ActionListener{
	
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem m1, m2;
	private JButton btnSalir;
	private JPanel contentPane;	
	private JLabel lblViajes;
	
	
	public vPrincipal(){
			

		
//		lblViajes.setIcon(new ImageIcon("H:\\1º cuatri\\Prog III\\git\\agenciaViajes\\AgenciaViajes\\src\\imagenes\\vuelos.jpg"));
//		lblViajes.setBounds(0, 0, 350, 114);
		
		
		setLayout(null);
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
		
//        contentPane.add(lblViajes); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vPrincipal principal = new vPrincipal();
		principal.setBounds(10,20,300,200);
		principal.setVisible(true);
		principal.setLocationRelativeTo(null); //Centrar la ventana
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
