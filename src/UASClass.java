import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentNavigableMap;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;

public class UASClass {

	private JFrame frame;
	private JTextField nama;
	private JTextField tempatlahir;
	private JTextField tanggallahir;
	private JTextField alamat;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UASClass window = new UASClass();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	ArrayList<Biodata> biodata = new ArrayList<Biodata>();
	
	public UASClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 610, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIODATA");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setBounds(267, 11, 71, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Nama            :");
		lblNewLabel_1.setBounds(22, 49, 95, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tempat lahir :");
		lblNewLabel_2.setBounds(22, 74, 95, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tanggal lahir :");
		lblNewLabel_3.setBounds(22, 100, 95, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Alamat            :");
		lblNewLabel_4.setBounds(22, 125, 95, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		nama = new JTextField();
		nama.setBounds(127, 46, 386, 20);
		frame.getContentPane().add(nama);
		nama.setColumns(10);
		
		tempatlahir = new JTextField();
		tempatlahir.setBounds(127, 71, 386, 20);
		frame.getContentPane().add(tempatlahir);
		tempatlahir.setColumns(10);
		
		tanggallahir = new JTextField();
		tanggallahir.setBounds(127, 97, 386, 20);
		frame.getContentPane().add(tanggallahir);
		tanggallahir.setColumns(10);
		
		alamat = new JTextField();
		alamat.setBounds(127, 122, 386, 20);
		frame.getContentPane().add(alamat);
		alamat.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 207, 574, 140);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("TAMPIL");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					biodata.add(new Biodata(nama.getText(),tempatlahir.getText(),tanggallahir.getText(),alamat.getText()));
					Biodata data = (Biodata)biodata.get(biodata.size()-1);
					textArea.setText("Urutan\t: "+biodata.size() + "\n" + "Nama\t:"+data.getNama() + "\n" + "Tempat Lahir\t:"+data.getTempatlahir() + "\n" + "Tanggal Lahir\t"+data.getTanggallahir() + "\n" + "Alamat\t:"+data.getAlamat());
					
					
				} catch(Exception e1) {
					
				}
				
				
							}
		});
		btnNewButton.setBounds(249, 164, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
	
}
