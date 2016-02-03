import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CsvTester {
	
	
	
	public static void main(String[] args){
		
		
		// Quick sequence of things to get all the file paths and repeat times linked
		// Doesn't work if name of files / order is changed
		File testDir = new File("./Testdata");
		Map<String,Integer> testFiles = new LinkedHashMap<String,Integer>();
		int[] catTimes = {1000,10000,10,100000,100 };
		for (int i = 0 ; i<testDir.listFiles().length; i++){
			testFiles.put( testDir.listFiles()[i].getAbsolutePath() , catTimes [i] );
		}
		
		
		try{
			// Create new file
			FileWriter writer = new FileWriter("test.csv");
			
			
			writer.flush();
			
			// Write header information
			writer.append("Concatenate Method,");
			String[] fileNames = new String[testFiles.size()];
			for (int i = 0 ; i<testDir.listFiles().length; i++){
				fileNames[i] = testDir.listFiles()[i].getName();
			}
			writer.append(String.join(",", fileNames));
			
			writer.append("\n");
			
			writer.append("Number of concatenations");
			
			for (int e : catTimes){
				writer.append(",");
				writer.append("" + e);
			}
			
			
			writer.append("\n");
			writer.append("Plus Operator,");
			MiniGenBankSeq test1 = new MiniGenBankSeq();
			for ( String filePath: testFiles.keySet()) {
				long time = test1.testConcatenate(filePath, testFiles.get(filePath) );
				writer.append(","+time);
			}
			
			writer.append("\n");
			writer.append("StringBuilder,");
			StringBuilderMiniGenBankSeq test2 = new StringBuilderMiniGenBankSeq();
			for ( String filePath: testFiles.keySet()) {
				long time = test2.testConcatenate(filePath, testFiles.get(filePath) );
				writer.append(","+time);
			}
			
			
			writer.append("\n");
			writer.append("StringWriter,");
			StringWriterMiniGenBankSeq test3 = new StringWriterMiniGenBankSeq();
			for ( String filePath: testFiles.keySet()) {
				long time = test3.testConcatenate(filePath, testFiles.get(filePath) );
				writer.append(","+time);
			}
			
			writer.close();

		}
		catch ( IOException e){
			e.printStackTrace();
		}
		
	}
	
	
}
