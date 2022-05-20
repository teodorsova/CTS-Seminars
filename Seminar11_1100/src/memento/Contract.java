package memento;

public class Contract {
	
	private String clientName;
	private String clauseContract;
	
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public String getClauseContract() {
		return clauseContract;
	}
	
	public void setClauseContract(String clauseContract) {
		this.clauseContract = clauseContract;
	}
	
	public Contract(String clientName) {
		super();
		this.clientName = clientName;
	}
	
	public Contract(String clientName, String clauseContract) {
		super();
		this.clientName = clientName;
		this.clauseContract = clauseContract;
	}
	
	@Override
	public String toString() {
		return "Contract [clientName=" + clientName + ", clauseContract=" + clauseContract + "]";
	}
	
	public void addClause(String newClause) {
		this.clauseContract += "\n" + newClause;
	}
	
	
	public void restoreFromVersion(ContractVersion clauseVersion) {
		//this.clauseContract; // = clauseVersion;
		System.out.println("Restore a specific version of the contract");
		this.clauseContract = clauseVersion.getClauseVersion();
	}
	
	// save version
	public ContractVersion saveVersion() {
		System.out.println("Save version of the contract");
		return new ContractVersion(this.clauseContract);
		
	}
	

}
