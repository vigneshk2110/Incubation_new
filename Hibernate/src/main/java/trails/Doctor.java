package trails;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "DoctorsList")
public class Doctor {
	
	@Id
	private int docNum;
	private String docName;
	
	Doctor() {
		super();
	}

	Doctor(int docNum, String docName) {
		super();
		this.docNum = docNum;
		this.docName = docName;
	}

	public String getDocName() {
		return docName;
	}
	
	public int getDocNum() {
		return docNum;
	}

	@Override
	public String toString() {
		return "Doctor [docNum=" + docNum + ", docName=" + docName + "]";
	}
	
	

	
}
