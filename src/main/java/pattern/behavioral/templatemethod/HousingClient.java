package pattern.behavioral.templatemethod;

public class HousingClient {

	public static void main(String[] args) {
		
		HouseTemplate houseType = new WoodenHouse();
		
		houseType.buildHouse();
		System.out.println("************");
		
		houseType = new GlassHouse();
		
		houseType.buildHouse();
	}

}
