package view;

public interface DoctorsInterface {
	
	default boolean practiced3Years(Doctor d1) {
		return true;
	}
	
	boolean memberIMA();
	
}
