




public class MiniGenBankSeq extends SequenceLoader {
	
	@Override
	public String toString() {
		return "MiniGenBankSeq:\nlocus:\t" + locus + "\naccession:\t" + accession + "\ndescription:\t" + description
				+ "\nsource:\t" + source;
	}
	
	
	private String locus=null;
	
	private String accession=null;
	
	private String description=null;
	
	private String source=null;
	
	
	/**
	 * Constructors
	 */
	MiniGenBankSeq(){
		this.locus = "Uninitialized";
		this.accession = "Uninitialized";
		this.description = "Uninitialized";
		this.source = "Uninitialized";
	}
	MiniGenBankSeq(String locus,String accession){
		this.locus = locus;
		this.accession = accession;
		this.description = "Uninitialized";
		this.source = "Uninitialized";
	}
	MiniGenBankSeq(String locus,String accession, String description,String source){
		this.locus = locus;
		this.accession = accession;
		this.description = description;
		this.source = source;
	}
	
	
	
	
	
	
	
	/*
	 *	
	 *Getters and setters for all private variables 
	 * 
	 */
	public String getLocus(){
			return locus;
	}
	public String getAccession(){
		return accession;
	}
	public String getDescription(){
		return description;
	}
	public String getSource(){
		return source;
	}
	
	
	
	public void setLocus(String locus){
		this.locus = locus;
	}

	public void setAccession(String accession){
		this.accession = accession;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public void setSource(String source){
		this.source = source;
	}
	
	
}
