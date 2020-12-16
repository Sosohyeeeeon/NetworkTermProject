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

	      JButton btnNewButton_Login = new JButton("로그인");
	      btnNewButton_Login.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            // 로그인 했을 때 작업
	            boolean bLoginChk = false;
	            /*boolean cLoginChk = false;*/
	            GetIdandPw(txtId, txtPw); // 입력된 값 각각 넘겨 주기
	            Login_Chk loginchk = new Login_Chk();
	            bLoginChk = loginchk.LogInList_Chk(sID,sPW);
	            /*cLoginChk = loginchk.LogInList_Chk2(sPW); 오류 다르게 지정?*/

	            if (!bLoginChk) { 
	               JOptionPane.showMessageDialog(null, "다시 로그인해주세요.");
	            } else { 
	               JOptionPane.showMessageDialog(null, "로그인되었습니다.");
	               LoginMain.login.setVisible(false); // 기존의 로그인 화면 꺼주기
	               //채팅화면?
	            }
	         }
	           /* if (!cLoginChk) { // 로그인 실패
		               JOptionPane.showMessageDialog(null, "비밀번호 확인 후\n다시 로그인해주세요.");
		        } else { // 로그인 성공
		               LoginMain.login.setVisible(false); 
		        }
	            if(bLoginChk && cLoginChk)
	            	LoginMain.login.setVisible(false);
	            //채팅화면 생성?
	         }*/
	             
	      });
	      btnNewButton_Login.setBounds(274, 27, 102, 46);
	      contentPane.add(btnNewButton_Login);

	      JButton btnNewButton_Sign = new JButton("회원 가입");
	      btnNewButton_Sign.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {            
	            LoginMain.join.setVisible(true); 
	         }
	      });
	      btnNewButton_Sign.setBounds(274, 80, 102, 30);
	      contentPane.add(btnNewButton_Sign);

	      JButton button_FindID = new JButton("ID 찾기");
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
