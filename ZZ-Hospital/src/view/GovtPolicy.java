package view;

public interface GovtPolicy {
	
		
	static boolean adheringMinistryOfHealthRules() {
		return true;
	}
	
	static boolean adheringStateHealthRules() {
		return true;
	}
	
	default int minimumAmbulenceCount() {
		return 2;
	}
	
	boolean emergencyExit();
	
	int DoctorsinDuty();

}
