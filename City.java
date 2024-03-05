package map.country;

public class City {
	
	private String name;
	private int pincode;
	private String famous;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getFamous() {
		return famous;
	}
	public void setFamous(String famous) {
		this.famous = famous;
	}
	
	
	@Override
	public String toString() {
		return "City [name=" + name + ", pincode=" + pincode + ", famous=" + famous + " ]";
	}
	
	

}
