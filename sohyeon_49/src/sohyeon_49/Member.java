package sohyeon_49;

import java.util.ArrayList;
import java.util.Vector;

import sohyeon_49.Member;

public class Member {
	public static Vector<Member> MemeverVec = new Vector<Member>(30);

	
	private String sid; // ���̵�
	private String spw; // ��й�ȣ
	private String sNickname;//����
	private String sName; // �̸�
	private String sBirth; // �������
	private String sEmail; // �̸���

	public Member() {

	}

	public Member(String sid, String spw) {
		this.sid = sid;
		this.spw = spw;
	}

	public Member( String sid, String spw,String sNickname, String sName, String sBirth, String sEmail) {
		this.sid = sid;
		this.spw = spw;
		this.sNickname = sNickname;
		this.sName = sName;
		this.sBirth = sBirth;
		this.sEmail = sEmail;
	}

	

	public String getName() {
		return this.sName;
	}

	public String getBirth() {
		return this.sBirth;
	}
	public String getNickname() {
		return this.sNickname;
	}

	public String getEmail() {
		return this.sEmail;
	}

	public String getSid() {
		return this.sid;
	}

	public String getSpw() {
		return this.spw;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void setSpw(String spw) {
		this.spw = spw;
	}

	public void setMemberInfo(String sid, String spw, String Nickname, String sName, String sBirth, String sEmail) {
		this.sid = sid;
		this.spw = spw;
		this.sName = sName;
		this.sNickname = Nickname;
		this.sBirth = sBirth;
		this.sEmail = sEmail;
	}

	public ArrayList<String> RetrunList() {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("�̸�");
		arrayList.add("����");
		arrayList.add("���̵�");
		arrayList.add("��й�ȣ");
		arrayList.add("�̸���");
		return arrayList;
	}

}
