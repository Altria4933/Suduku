
public class SudukuTable {

	private SingleNumber[][] table;
	private Level level;

	// default constructor
	public SudukuTable() {
		this.table = new SingleNumber[9][9];
		this.setLevel(Level.Undefined);
	}
	
	
    //set default value
	public void setDefaultNumber() {
		for (int i = 0; i <= 9; i++) {
			for (int y = 0; y <= 9; y++) {
				table[i][y] = new SingleNumber();

			}

		}

	}
	
	public void setNumber (int x, int y, int value, boolean writable) {
		for (x = 0; x <= 9; x++) {
			for (y = 0; y <= 9; y++) {
				table[x][y] = new SingleNumber(value, writable);
			}

		}		
	}
	
	

	public SingleNumber[][] getTable() {
		return table;
	}

	public void setTable(SingleNumber[][] table) {
		this.table = table;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

}
