package pattern.creational.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		
		System.out.println(comp.getHDD() + "_" + comp.getRAM() + "_"+ comp.isBluetoothEnabled() + "_" + comp.isGraphicsCardEnabled());
	}

}
