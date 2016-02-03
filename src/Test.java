import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
		
		// Quick sequence of things to get all the file paths and repeat times linked
		// Doesn't work if name of files / order is changed
		File testDir = new File("./Testdata");
		Map<String,Integer> testFiles = new HashMap<String,Integer>();
		int[] catTimes = {1000,10000,10,100000,100 };
		for (int i = 0 ; i<testDir.listFiles().length; i++){
			testFiles.put( testDir.listFiles()[i].getAbsolutePath() , catTimes [i] );
		}
		
		
		
		
		MiniGenBankSeq test1 = new MiniGenBankSeq();
		
		
		for ( String filePath: testFiles.keySet()) {
			
			long time = test1.testConcatenate(filePath, testFiles.get(filePath) );
			
			System.out.println(new File(filePath).getName() + " repeated " + testFiles.get(filePath) + 
					" times takes " + time + " nanoseconds");
		}
		
		
		
		
	}

}
