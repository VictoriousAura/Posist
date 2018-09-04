import java.util.Iterator;
import java.util.LinkedList;

// A record has nodes
public class Record {
	double recordValue;
	int recordOwnerId;
	String recordOwnerName;
	// List of nodes
	LinkedList <Node> listOfNodes;
	
	Record(double value) {
		recordValue = value;
		listOfNodes = new LinkedList();
	}
	
	void setRecordOwnerId(int id) {
		recordOwnerId = id;
	}
	
	void setRecordOwnerName(String name) {
		recordOwnerName = name;
	}
	
	void addNodeInRecord() {
		if (listOfNodes.size() == 0) {
			Node genesisNode = new Node(null, "A");
			genesisNode.setNodeOwnerId(recordOwnerId);
			genesisNode.setNodeOwnerName(recordOwnerName);
			genesisNode.setRecordValue(recordValue);
			listOfNodes.add(genesisNode);
		}
	}
	
	void getNodes() {
		Iterator <Node> itr = listOfNodes.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}