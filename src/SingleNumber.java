
public class SingleNumber {
	
	private int value;
	private boolean writeable;
	private boolean is_true;
	
	//default constructor
	public SingleNumber () {
		this.value = 0;
		this.writeable = true;
		this.is_true = true;
		
		
	}
	
	public SingleNumber(int value, boolean weiteable) {
		this.setValue(value);
		this.setWriteable(writeable);
		this.is_true = true;
		
	}
	
	public int getValue () {
		return this.value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	public boolean isWriteable() {
		return writeable;
	}

	public void setWriteable(boolean writeable) {
		this.writeable = writeable;
	}

	public boolean isIs_true() {
		return is_true;
	}

	public void setIs_true(boolean is_true) {
		this.is_true = is_true;
	}
	
	//testing
	//public String toString () {
		//return this.getValue();
	//}

	
	

}
