package diTest;

public class Computer {
	private MainBoard mainboard;
	private Ram ram;
	
	public Computer(MainBoard mainboard, Ram ram) {
		super();
		this.mainboard = mainboard;
		this.ram = ram;
	}

	public MainBoard getMainboard() {
		return mainboard;
	}

	public void setMainboard(MainBoard mainboard) {
		this.mainboard = mainboard;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	
	
}
