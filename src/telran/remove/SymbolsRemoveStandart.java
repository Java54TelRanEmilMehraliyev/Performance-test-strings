package telran.remove;

public class SymbolsRemoveStandart implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {

		return str.replaceAll(Character.toString(symbol), "");
	}
}
