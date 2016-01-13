/*poner imagen principal
 * */
package ventanas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class vPrincipal extends JFrame implements ActionListener{
	
	private JMenuBar mb;
	private JMenu menu1;
	private JMenuItem m1, m2;
	private JButton btnSalir;
	
	public vPrincipal(){
		
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
        
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vPrincipal principal1 = new vPrincipal();
		principal1.setBounds(10,20,300,200);
		principal1.setVisible(true);
		principal1.setLocationRelativeTo(null); //Centrar la ventana
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Container f=this.getContentPane();
        if (e.getSource()==m1) {
        	vInformeViajes informe = new vInformeViajes();
       	 	informe.setVisible(true);
        }
        if (e.getSource()==m2) {
        	vAdmin admin = new vAdmin();
            admin.setVisible(true);
        	 
        }
           
	}

}
