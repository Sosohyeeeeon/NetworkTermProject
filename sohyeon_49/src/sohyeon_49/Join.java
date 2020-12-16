package sohyeon_49;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


import File.File;
import sohyeon_49.Join_Chk;
import sohyeon_49.LoginMain;
import sohyeon_49.Member;

	@SuppressWarnings("serial")
	public class Join extends JFrame {

		private JPanel contentPane;
		private JTextField textField_Id;
		private JPasswordField textField_PW;
		private JTextField textField_Nickname;
		private JTextField textField_Name;
		private JTextField textField_Birth;
		private JTextField textField_email;
		private JButton button;
		private boolean brepetiteChk = false; // 아이디 중복 체크

		private void Reset(JTextField textField_Id, JTextField textField_PW, JTextField textField_Nickname,
				JTextField textField_Name, JTextField textField_Birth, JTextField textField_email) {
			textField_Id.setText(null);
			textField_PW.setText(null);
			textField_Nickname.setText(null);
			textField_Name.setText(null);
			textField_Birth.setText(null);
			textField_email.setText(null);
		}

		public Join() {
			contentPane = new JPanel();
			contentPane.setBackground(Color.white);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);

			textField_Id = new JTextField();
			textField_Id.setBounds(110, 23, 155, 21);
			contentPane.add(textField_Id);
			textField_Id.setColumns(10);

			textField_PW = new JPasswordField();
			textField_PW.setColumns(10);
			textField_PW.setBounds(110, 54, 155, 21);
			contentPane.add(textField_PW);

			textField_Nickname = new JTextField();
			textField_Nickname.setColumns(10);
			textField_Nickname.setBounds(110, 85, 155, 21);
			contentPane.add(textField_Nickname);

			textField_Name = new JTextField();
			textField_Name.setColumns(10);
			textField_Name.setBounds(110, 119, 155, 21);
			contentPane.add(textField_Name);

			textField_Birth = new JTextField();
			textField_Birth.setColumns(10);
			textField_Birth.setBounds(110, 150, 155, 21);
			contentPane.add(textField_Birth);

			textField_email = new JTextField();
			textField_email.setColumns(10);
			textField_email.setBounds(110, 181, 155, 21);
			contentPane.add(textField_email);

			setForeground(Color.WHITE);
			setBackground(Color.PINK);
			setTitle("\uD68C\uC6D0 \uAC00\uC785");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 459, 268);

			JLabel lblId = new JLabel("ID");
			lblId.setHorizontalAlignment(SwingConstants.RIGHT);
			lblId.setBounds(30, 26, 57, 15);
			contentPane.add(lblId);

			JLabel lblPw = new JLabel("PW");
			lblPw.setHorizontalAlignment(SwingConstants.RIGHT);
			lblPw.setBounds(30, 57, 57, 15);
			contentPane.add(lblPw);

			JLabel lblNickname = new JLabel("Nickname");
			lblNickname.setBackground(Color.GRAY);
			lblNickname.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNickname.setBounds(30, 88, 57, 15);
			contentPane.add(lblNickname);

			JLabel lblName = new JLabel("Name");
			lblName.setHorizontalAlignment(SwingConstants.RIGHT);
			lblName.setBounds(30, 122, 57, 15);
			contentPane.add(lblName);

			JLabel lblBirth = new JLabel("Birth");
			lblBirth.setHorizontalAlignment(SwingConstants.RIGHT);
			lblBirth.setBounds(30, 153, 57, 15);
			contentPane.add(lblBirth);

			

			button = new JButton("중복 확인");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Join_Chk joinchk = new Join_Chk();
					if (!textField_Id.getText().equals("")) {
						brepetiteChk = joinchk.RepetiteID(textField_Id.getText());
						if (!brepetiteChk)
							LoginMain.ShowMessage("이미 있는 아이디 입니다.\n사용이 불가능합니다.");
						else
							LoginMain.ShowMessage("사용이 가능한 아이디 입니다.");
					} else {
						LoginMain.ShowMessage("아이디를 입력해주세요.");
					}
					// 아이디를 받아들여 중복 체크하기
				}
			});
			JButton button_1 = new JButton("완료");
			button_1.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent arg0) {
					

					Join_Chk joinchk = new Join_Chk();

				
					if (!brepetiteChk) {
						LoginMain.ShowMessage("아이디 중복 체크해주세요.");
						return;
					}
					/*if( lblBirth == null ) {
						LoginMain.ShowMessage("생년월일을 입력하세요");
					}적용안됨?*/
					
					LoginMain.ShowMessage("회원 가입 되었습니다. 로그인 해주세요");
					
					Member.MemeverVec.addElement(new Member(textField_Id.getText(), textField_PW.getText(),
							textField_Nickname.getText(), textField_Name.getText(), textField_Birth.getText(), textField_email.getText()));
					File.SaveToFile("Memberlist.txt");
					Reset(textField_Id, textField_PW, textField_Nickname, textField_Name, textField_Birth, textField_email);
					Reset(textField_Id, textField_PW, textField_Nickname , textField_Name, textField_Birth, textField_email);

					LoginMain.join.setVisible(false);
					LoginMain.login.setVisible(true);
				}
			});

			button.setBounds(277, 23, 145, 21);
			contentPane.add(button);
			button_1.setBounds(277, 181, 145, 21);
			contentPane.add(button_1);

			JLabel label = new JLabel("E-mail");
			label.setHorizontalAlignment(SwingConstants.RIGHT);
			label.setBounds(19, 184, 79, 15);
			contentPane.add(label);
		}


}
