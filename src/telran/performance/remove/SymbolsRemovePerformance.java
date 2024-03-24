package telran.performance.remove;

import telran.performance.PerformanceTest;
import telran.remove.SymbolsRemove;

public class SymbolsRemovePerformance extends PerformanceTest {
	String[] array;
	SymbolsRemove symbolsRemove;

	protected SymbolsRemovePerformance(String displayName, int nRuns, SymbolsRemove symbolsRemove, String[] array) {
		super(displayName, nRuns);
		this.symbolsRemove = symbolsRemove;
		this.array = array;
	}

	@Override
	protected void runTest() {
		for (String str : array) {
			symbolsRemove.removeSymbol(str, 'a');
		}

	}
}
