




public class MiniGenBankSeq {
	
	
	@Override
	public String toString() {
		
		
		for (String e : new String[] { locus, accession, description, source } ){
			if (e == null){
				throw new NullPointerException("Variables are null");
			}
		}
		
		return "MiniGenBankSeq:\nlocus\t" + locus + ",\naccession\t" + accession + ",\ndescription\t" + description
				+ ",\nsource\t" + source;
	}
	
	
	private String locus=null;
	
	private String accession=null;
	
	private String description=null;
	
	private String source=null;
	
	
	/**
	 * Constructors
	 */
	MiniGenBankSeq(){
	}
	MiniGenBankSeq(String locus,String accession){
		this.locus = locus;
		this.accession = accession;
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
		if(locus != null){
			return locus;
		}
		else{
			throw new NullPointerException("locus is not set");
		}
	}
	public String getAccession(){
		if(accession != null){
			return accession;
		}
		else{
			throw new NullPointerException("accession is not set");
		}
	}
	public String getDescription(){
		if(description != null){
			return description;
		}
		else{
			throw new NullPointerException("description is not set");
		}
	}
	public String getSource(){
		if(source != null){
			return source;
		}
		else{
			throw new NullPointerException("source is not set");
		}
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
