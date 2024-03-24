package telran.performance.remove;

import telran.remove.SymbolsRemoveCharArray;
import telran.remove.SymbolsRemoveStandart;

public class SymbolRemovePerformanceApp {
	public static void main(String[] args) {
		int N_SYMBOLS = 100;
		String testString = generateRandomString(N_SYMBOLS);
		System.out.println("Generated String: " + testString);
	    int nRuns = 10;
        
	    SymbolsRemovePerformance performanceTestCharArray = new SymbolsRemovePerformance("Test for SymbolsRemoveCharArray implementation", nRuns, new SymbolsRemoveCharArray(), new String[]{testString});
        performanceTestCharArray.run();

        SymbolsRemovePerformance performanceTestStandard = new SymbolsRemovePerformance("Test for SymbolsRemoveStandard implementation", nRuns, new SymbolsRemoveStandart(), new String[]{testString});
        performanceTestStandard.run();
    }

	private static String generateRandomString(int length) {
		StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (32 + Math.random() * 95); 
            sb.append(randomChar);
        }
        return sb.toString();
    }
}

