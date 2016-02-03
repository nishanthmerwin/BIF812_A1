
public class UseMiniGeneBankSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Test with no arguments given to constructor
		MiniGenBankSeq test1 = new MiniGenBankSeq();
		System.out.println(test1.toString());
		test1.setAccession("PubMed");
		test1.setDescription("Sequenced under duress");
		test1.setLocus("The foot");
		test1.setSource("Sequenced by Illumina");
		System.out.println(test1.toString());
		
		
		
		// Test with 2 arguments given to constructor
		MiniGenBankSeq test2 = new MiniGenBankSeq("The foot","PubMed");
		System.out.println(test2.toString());
		test2.setDescription("Sequenced under duress");
		test2.setSource("Sequenced by Illumina");
		System.out.println(test2.toString());
		
		
		// Test with 4 arguments given to constructor
		MiniGenBankSeq test3 = new MiniGenBankSeq("The foot","PubMed","Sequenced under duress","Sequence by Illumina");
		System.out.println(test3.toString());
		
		
	}

}
