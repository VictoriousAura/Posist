import java.util.Iterator;
import java.util.LinkedList;

// An owner owns a list of records
public class Owner {
	int ownerId;
	String ownerName;
	// Dynamic list of records
	LinkedList <Record> listOfRecords;
	
	Owner(int id, String name) {
		ownerId = id;
		ownerName = name;
		listOfRecords = new LinkedList();
	}
		
	void createRecord(double value) {
		Record recordOne = new Record(value);
		recordOne.setRecordOwnerId(this.ownerId);
		recordOne.setRecordOwnerName(this.ownerName);
		recordOne.addNodeInRecord();
		listOfRecords.add(recordOne);
	}

	void getRecords() {
		Iterator <Record> itr = listOfRecords.iterator();
		while (itr.hasNext()) {
			System.out.println("Records of this owner:");
			System.out.println(itr.next());
			System.out.println("Nodes in this record:");
			itr.next().getNodes();
		}
	}
}