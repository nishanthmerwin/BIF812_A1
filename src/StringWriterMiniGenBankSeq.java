import java.io.StringWriter;

public class StringWriterMiniGenBankSeq extends MiniGenBankSeq{
	
	
	
	public void concatenate(String sequence, int times){
		
		StringWriter seqA = new StringWriter();
		seqA.write(sequence);
		
		
		for(int i=0; i < times ; i++){
			seqA.write(sequence);
		}
		seqA.flush();
	}
	
}
