package test1;


public class Doctor {
	
	private int docNum;
	private String docName;

	
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
	
	

	
}
