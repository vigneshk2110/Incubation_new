package view;

public interface GovtPolicy {
	
	default int minimumAmbulenceCount() {
		return 2;
	}
	
	default boolean adheringMinistryOfHealthRules() {
		return true;
	}
	
	default boolean adheringStateHealthRules() {
		return true;
	}
	
	boolean emergencyExit();
	
	int DoctorsinDuty();

}
