package sohyeon_49;

import sohyeon_49.Member;

public class Join_Chk {
	public Join_Chk() {

	}

	public boolean RepetiteID(String sid) // ���̵� �ߺ� Ȯ��
	{
		for (int i = 0; i < Member.MemeverVec.size(); i++) {
			if (Member.MemeverVec.get(i).getSid().equals(sid)) {
				return false;
			}
		}
		return true;
	}

}

