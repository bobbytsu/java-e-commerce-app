package ECOM;
import javax.swing.*;
import java.awt.Component;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
	//Login
	String inputusername = "";
	String inputpassword = "";
	
	//Search
	String intputsearch = "";
	
	public Main(){
		//Login
		JButton btnLogin = new JButton("Login");
		
		JLabel lblUserName = new JLabel();
		JTextField UserName = new JTextField(50);
		JTextField Password = new JTextField(10);
		JLabel text2 = new JLabel("User Name");
		JLabel text3 = new JLabel("Password");
		
		//Kategori
		JLabel text1 = new JLabel("Kategori");
		JComboBox cmb = new JComboBox(new Object[] {"Pakaian", "Elektronik", "Gadget", "Hobi", "Olahraga"});

		//Shopping Cart
		JButton btnShoppingCart = new JButton("Shopping Cart");
		
		//Search
		JTextField Search = new JTextField(50);
		JButton btnSearch = new JButton("Search");
		

		JPanel panel = new JPanel();
		
		add(panel);
		panel.add(text1);
		panel.add(cmb);
		panel.add(Search);
		panel.add(btnSearch);
		panel.add(btnShoppingCart);
		panel.add(lblUserName);
		panel.add(text2);
		panel.add(UserName);
		panel.add(text3);
		panel.add(Password);
		panel.add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				inputusername = UserName.getText();
				inputpassword = Password.getText();

				if(inputusername.equals("arthurgultom") && inputpassword.equals("password")){
					JOptionPane.showMessageDialog(panel, "Logged in!");
					lblUserName.setText(inputusername);
				} else {
					JOptionPane.showMessageDialog(panel, "Please try again");
				}
			}
		});
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame form = new Main();
		form.setTitle("E-Commerce");
		form.setSize(1000, 1000);
		form.setLocationRelativeTo(null);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setVisible(true);
		form.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
