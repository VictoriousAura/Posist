import java.util.ArrayList;
import java.util.Date;

/* Nodes are contained inside a record owned by an owner.
   It has some information associated to it as mentioned below
*/
public class Node {
	static int nodeCount;
	Date timestamp;
	String data;
	// Incremental integral value
	int nodeNumber;
	// Unique node identifier
	String nodeId;
	// Address of parent node
	String referenceNodeId;
	// Addresses of child nodes
	ArrayList <String> childReferenceNodeId;
	// Address of genesis node
	String genesisReferenceNodeId;
	String hashValue;
	int nodeOwnerId;
	String nodeOwnerName;
	double nodeRecordValue;
	
	// Node constructor
	Node(String parentId, String nodeId) {
		referenceNodeId = parentId;
		this.nodeId = nodeId;
		timestamp = new Date();
		nodeNumber = ++nodeCount;
		childReferenceNodeId = new ArrayList();
	}
	
	void setNodeOwnerId(int nodeOwnerId) {
		this.nodeOwnerId = nodeOwnerId;
	}
	
	void setNodeOwnerName(String nodeOwnerName) {
		this.nodeOwnerName = nodeOwnerName;
	}
	
	void setRecordValue(double nodeRecordValue) {
		this.nodeRecordValue = nodeRecordValue;
	}
	
	String getNodeId() {
		return nodeId;
	}
	
	// TODO
	void addChildNode() {
		childReferenceNodeId.add("");
	}
	
	public String encryptData() {
		String plainText = nodeOwnerId + nodeRecordValue + nodeOwnerName + nodeId + nodeRecordValue;
		data = plainText.hashCode() + "";
		return data;
	}
	
	public String computeHashValue() {
		String plainText = timestamp + data + nodeNumber + nodeId + referenceNodeId + genesisReferenceNodeId;
		hashValue = plainText.hashCode() + "";
		return hashValue;
	}
}