// Main class
public class PosistTest {
	public static void main(String[] args) {
		System.out.println("POSist Coding Test: Round2");
		Owner ownerOne = new Owner(1, "Shrreya Behll");
		ownerOne.createRecord(17.4);
		ownerOne.createRecord(27.6);
		ownerOne.getRecords();
	}

}