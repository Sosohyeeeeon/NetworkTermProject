package sohyeon_49;

import sohyeon_49.Member;

public class Login_Chk {
	public Login_Chk() {

	}
	
	public boolean LogInList_Chk(String sID, String sPW) {
		// TODO Auto-generated method stub
		for (int i = 0; i < Member.MemeverVec.size(); i++) {
			if (Member.MemeverVec.get(i).getSid().equals(sID) && Member.MemeverVec.get(i).getSpw().equals(sPW)) {
				return true;
			}
		}
		return false;
	}

}	
	/*public boolean LogInList_Chk(String sID)  {
		// TODO Auto-generated method stub
		for (int i = 0; i < Member.MemeverVec.size(); i++) {
			if (Member.MemeverVec.get(i).getSid().equals(sID)) { 
				return true;
			}
		}
		return false;
		
	}
	
	public boolean LogInList_Chk2(String sPW) {
		// TODO Auto-generated method stub
		for (int i = 0; i < Member.MemeverVec.size(); i++) {
			if (Member.MemeverVec.get(i).getSpw().equals(sPW)) {
				return true;
			}
		}
		return false;
		
		}
	}*/
	
	
