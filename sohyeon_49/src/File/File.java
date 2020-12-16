package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import sohyeon_49.Member;

public class File {
	static String StringForSave = "";

	public File() { // 생성자

	}

	public static void SetFileInputList(String sfilename) { // 파일 이름을 받아 그 해당하는 리스트
		BufferedReader read = null;
		String s = null;
		Member member = null;
		try {
			read = new BufferedReader(new FileReader(sfilename));
			try {
				while ((s = read.readLine()) != null) {
					StringTokenizer row = new StringTokenizer(s, ",");
					while (row.hasMoreTokens()) // 리턴할 다음 토큰이 있는지 여부 확인
					{
						Object tempobj[] = new Object[6];
						
						if (sfilename.equals("Memberlist.txt")) {
							member = new Member(tempobj[0].toString(), tempobj[1].toString(), tempobj[2].toString(),
									tempobj[3].toString(), tempobj[4].toString(), tempobj[5].toString());
							Member.MemeverVec.addElement(member);
						}
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (

		FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				read.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void SaveToFile(String sfilename) {
		Object tempObject[] = new Object[6];
		StringForSave = "";
		 if (sfilename.equals("Memberlist.txt")) {
			for (int i = 0; i < Member.MemeverVec.size(); i++) {
				
				tempObject[0] = Member.MemeverVec.elementAt(i).getSid();
				tempObject[1] = Member.MemeverVec.elementAt(i).getSpw();
				tempObject[2] = Member.MemeverVec.elementAt(i).getName();
				tempObject[3] = Member.MemeverVec.elementAt(i).getNickname();
				tempObject[4] = Member.MemeverVec.elementAt(i).getBirth();
				tempObject[5] = Member.MemeverVec.elementAt(i).getEmail();

				makeString(tempObject);
			}
		}
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(sfilename));
			writer.write(StringForSave);
			StringForSave = ""; // 초기화
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void makeString(Object row[]) { // 구분자 생성
		for (int i = 0; i < 6 - 1; i++)
			StringForSave = StringForSave + row[i] + ",";
		StringForSave = StringForSave + row[6 - 1] + "\n";
	}

}
