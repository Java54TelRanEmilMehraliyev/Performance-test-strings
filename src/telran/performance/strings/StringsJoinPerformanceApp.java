package telran.performance.strings;

import telran.strings.StringJoinOperator;
import telran.strings.StringsJoin;
import telran.strings.StringsJoinBuilder;

public class StringsJoinPerformanceApp {

	private static final int N_STRINGS = 1000;
	private static final int N_RUNS = 1000;
	
	public static void main(String[] args) {
    String [] array = getArray(N_STRINGS);
    StringsJoinPerformance testBuilder = getTest(array, N_RUNS, "test of StringsJoinBuilder", new StringsJoinBuilder());
    StringsJoinPerformance testOperator = getTest(array, N_RUNS, "test of StringsJoinBuilder", new StringJoinOperator());
	testBuilder.run();
	testOperator.run();
	}
                
	private static StringsJoinPerformance getTest(String[] array, int nRuns, String string,
			StringsJoin stringsJoin) {
		return new StringsJoinPerformance(string,nRuns,stringsJoin,array);
	}

	private static String[] getArray(int nStrings) {
    String[] res = new String[nStrings];
    for(int i = 0; i < res.length; i++) {
    	res[i] = "Hello String";
    }
    return res;
	}

}
