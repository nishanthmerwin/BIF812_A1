
public class StringBuilderMiniGenBankSeq extends MiniGenBankSeq {
	
	
	public void concatenate(String sequence, int times){
		
		StringBuilder seqA = new StringBuilder(sequence);
		for(int i=0; i < times ; i++){
			seqA.append(sequence);
		}
	}
	
	
}
