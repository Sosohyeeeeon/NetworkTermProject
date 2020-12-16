package sohyeon_49;

import java.util.Vector;

import javax.swing.JOptionPane;


import sohyeon_49.LoginMain;
import sohyeon_49.Member;

public class LoginMain{


	public static FindId findId = new FindId(); 
	public static Join join = new Join(); 
	public static Login login = new Login(); 
	public static boolean bLogInStatus = false;

	public static void ShowMessage(String str) {
		JOptionPane.showMessageDialog(null, str);
	}
	
	public static Login main = new Login();

	public static void main(String[] args) {
		main.Login();
		main.setVisible(true);
	}

	
}
