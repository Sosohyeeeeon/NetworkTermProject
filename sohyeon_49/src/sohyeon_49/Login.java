package sohyeon_49;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {
	
	   private JPanel contentPane;
	   private JTextField txtId;
	   private JPasswordField txtPw;

	   private String sID = "";
	   private String sPW = "";

	   public void Login() {

	      setTitle("This is NetworkTermproject");
	      setBounds(100, 100, 522, 164);
	      contentPane = new JPanel();
	      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	      setContentPane(contentPane);
	      contentPane.setLayout(null);

	      JLabel lblId = new JLabel("ID");
	      lblId.setHorizontalAlignment(SwingConstants.CENTER);
	      lblId.setBounds(40, 30, 47, 15);
	      contentPane.add(lblId);

	      txtId = new JTextField();
	      txtId.setText("");
	      // sID = txtId.getText();
	      txtId.setBounds(99, 27, 167, 21);
	      contentPane.add(txtId);
	      txtId.setColumns(10);

	      JLabel lblPw = new JLabel("PW");
	      lblPw.setHorizontalAlignment(SwingConstants.CENTER);
	      lblPw.setBounds(40, 55, 47, 15);
	      contentPane.add(lblPw);

	      txtPw = new JPasswordField();
	      txtPw.setText("");
	      // sPW = txtId.getText();
	      txtPw.setBounds(99, 52, 167, 21);
	      contentPane.add(txtPw);
	      txtPw.setColumns(10);

	      JButton btnNewButton_Login = new JButton("�α���");
	      btnNewButton_Login.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            // �α��� ���� �� �۾�
	            boolean bLoginChk = false;
	            /*boolean cLoginChk = false;*/
	            GetIdandPw(txtId, txtPw); // �Էµ� �� ���� �Ѱ� �ֱ�
	            Login_Chk loginchk = new Login_Chk();
	            bLoginChk = loginchk.LogInList_Chk(sID,sPW);
	            /*cLoginChk = loginchk.LogInList_Chk2(sPW); ���� �ٸ��� ����?*/

	            if (!bLoginChk) { 
	               JOptionPane.showMessageDialog(null, "�ٽ� �α������ּ���.");
	            } else { 
	               JOptionPane.showMessageDialog(null, "�α��εǾ����ϴ�.");
	               LoginMain.login.setVisible(false); // ������ �α��� ȭ�� ���ֱ�
	               //ä��ȭ��?
	            }
	         }
	           /* if (!cLoginChk) { // �α��� ����
		               JOptionPane.showMessageDialog(null, "��й�ȣ Ȯ�� ��\n�ٽ� �α������ּ���.");
		        } else { // �α��� ����
		               LoginMain.login.setVisible(false); 
		        }
	            if(bLoginChk && cLoginChk)
	            	LoginMain.login.setVisible(false);
	            //ä��ȭ�� ����?
	         }*/
	             
	      });
	      btnNewButton_Login.setBounds(274, 27, 102, 46);
	      contentPane.add(btnNewButton_Login);

	      JButton btnNewButton_Sign = new JButton("ȸ�� ����");
	      btnNewButton_Sign.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {            
	            LoginMain.join.setVisible(true); 
	         }
	      });
	      btnNewButton_Sign.setBounds(274, 80, 102, 30);
	      contentPane.add(btnNewButton_Sign);

	      JButton button_FindID = new JButton("ID ã��");
	      button_FindID.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            // LoginMain.login.setVisible(false); 
	            LoginMain.findId.setVisible(true);
	         }
	      });
	      button_FindID.setBounds(40, 80, 109, 30);
	      contentPane.add(button_FindID);
	   }
	   private void GetIdandPw(JTextField txtId, JTextField txtPw) {
	      // TODO Auto-generated method stub
	      sID = txtId.getText();
	      sPW = txtPw.getText();
	   }


}
