package hi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String cName;
	private int cCost;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcCost() {
		return cCost;
	}
	public void setcCost(int cCost) {
		this.cCost = cCost;
	}
	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", cCost=" + cCost + "]";
	}
	
	
	
}
