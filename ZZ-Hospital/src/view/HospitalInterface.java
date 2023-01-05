package view;

public interface HospitalInterface {
	
	
	default int minimumAmbulenceCount() {
		return 1;		
	}
	
	String hospitalRegID();	

}
