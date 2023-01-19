package trails;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Transient;

@Entity
public class Medicine {

	
	@Id
	private int medID;
	private String medName;
//	@Transient
	private int quantityAvailable;
	private int costPerUnit;

	Medicine(int medID, String medName, int quantityAvailable, int costper10) {
		super();
		this.medID = medID;
		this.medName = medName;
		this.quantityAvailable = quantityAvailable;
		this.costPerUnit = costper10;
	}
	
	Medicine() {
		super();
	}

	public Medicine(Medicine med) {
		this.medID = med.medID;
		this.medName = med.medName;
		this.quantityAvailable = med.quantityAvailable;
		this.costPerUnit = med.costPerUnit;
	}

	public int getCostPerUnit() {
		return costPerUnit;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public int getMedID() {
		return medID;
	}

	public String getMedName() {
		return medName;
	}

	@Override
	public String toString() {
		return "Medicine [medID=" + medID + ", medName=" + medName + ", quantityAvailable=" + quantityAvailable
				+ ", costPerUnit=" + costPerUnit + "]";
	}

	


}
