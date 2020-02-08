
import javax.swing.*;
import java.awt.*;


class Formulario extends JFrame{
	ImageIcon iconobtn = new ImageIcon("C:\\Users\\yero9\\Pictures\\right.png");
	
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Formulario(){
		getContentPane().setLayout(gbl); //layout nulo
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Formulario de Registro");
		setLocationRelativeTo(null);
		setVisible(true);
		
		JLabel lblTexto0 = new JLabel();
		lblTexto0.setText("The Classic Form includes all visible fields for this list");
		metodoMagico(lblTexto0, 0, 0, 6, 1);
		
		
		JLabel lblTexto1 = new JLabel();
		lblTexto1.setText("Form Options");
		metodoMagico(lblTexto1, 0, 1, 1, 1);
		
		JLabel lblTexto2 = new JLabel();
		lblTexto2.setText("Include the following");
		metodoMagico(lblTexto2, 0, 2, 1, 1);
		
		JCheckBox checkbox1 = new JCheckBox("a title for your form");
		metodoMagico(checkbox1, 0, 3, 1, 1);
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton radio1 = new JRadioButton("Only required fields");
		bg.add(radio1);
		metodoMagico(radio1, 0, 4, 1, 1);
		JRadioButton radio2 = new JRadioButton("all fields");
		bg.add(radio2);
		metodoMagico(radio2, 0, 5, 1, 1);
		
		JLabel lblTexto3 = new JLabel();
		lblTexto3.setText("(edit required fields in the form builder)");
		metodoMagico(lblTexto3, 0, 6, 1, 1);
		
		JCheckBox checkbox2 = new JCheckBox("interest group fields");
		metodoMagico(checkbox2, 0, 7, 1, 1);
		JCheckBox checkbox3 = new JCheckBox("required field indicators");
		metodoMagico(checkbox3, 0, 8, 1, 1);
		
		JLabel lblTexto4 = new JLabel();
		lblTexto4.setText("Set form width");
		metodoMagico(lblTexto4, 0, 9, 1, 1);
		
		JTextField caja1 = new JTextField(10);
		metodoMagico(caja1, 0, 10, 1, 1);
		
		JLabel lblTexto5 = new JLabel();
		lblTexto5.setText("Enhance your form");
		metodoMagico(lblTexto5, 0, 11, 1, 1);
		
		JCheckBox checkbox4 = new JCheckBox("enable evil popup mode");
		metodoMagico(checkbox4, 0, 12, 1, 1);
		JCheckBox checkbox5 = new JCheckBox("disable all JavaScript");
		metodoMagico(checkbox5, 0, 13, 1, 1);
		JCheckBox checkbox6 = new JCheckBox("incluide archive link");
		metodoMagico(checkbox6, 0, 14, 1, 1);
		JCheckBox checkbox7 = new JCheckBox("include MonkeyRewards lind");
		metodoMagico(checkbox7, 0, 15, 1, 1);
		
		
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createTitledBorder("Preview"));
		//setPreferredSize(new Dimension(200,200));
		
		
			JLabel lblTexto7 = new JLabel();
			lblTexto7.setText("Email Address");
			metodoMagico(lblTexto7, 8, 1, 1, 1);
			
			JFormattedTextField ftf = new JFormattedTextField ();
			metodoMagico(ftf, 7, 2, 20, 1);
			
			JLabel lblTexto8 = new JLabel();
			lblTexto8.setText("First Name");
			metodoMagico(lblTexto8, 8, 3, 1, 1);
			
			JTextField caja2 = new JTextField(10);
			metodoMagico(caja2, 8, 4, 1, 1);
			
			JLabel lblTexto9 = new JLabel();
			lblTexto9.setText("Last Name");
			metodoMagico(lblTexto9, 8, 5, 1, 1);
			
			JTextField caja3 = new JTextField(10);
			metodoMagico(caja3, 8, 6, 1, 1);
			
			JButton btnSuscribe = new JButton("Suscribe");
			btnSuscribe.setIcon(iconobtn);
			metodoMagico(btnSuscribe, 8, 7, 1, 1);
			
		metodoMagico(panel1, 7, 0, 10, 1);
			
		JLabel lblTexto10 = new JLabel();
		lblTexto10.setText("Copy/paste onto your site");
		metodoMagico(lblTexto10, 7, 9, 10, 1);
		
		JTextArea areaTexto = new JTextArea("Escribe aqui...",10,10);
		areaTexto.setLineWrap(true);
		areaTexto.setWrapStyleWord(true);
		metodoMagico(areaTexto, 7, 10, 10, 8);
			
			/*
			
			
			
			
			
			
			
			
			
		add(panel1); 
        	
		/*
		
		
		*/
		
		pack();
	}
	
	public void metodoMagico(JComponent c, int gx, int gy, int gw, int gh) {
		gbc.gridx = gx;
		gbc.gridy = gy;
		gbc.gridwidth = gw;
		gbc.gridheight = gh;
		gbl.setConstraints(c, gbc);
		add(c);
	}
}
public class PruebaFormulario {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Formulario();
			}
		});
	}

}

