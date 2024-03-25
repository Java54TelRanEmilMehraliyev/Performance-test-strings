package telran.remove;

public class SymbolsRemoveStandart implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {
          StringBuilder result = new StringBuilder();
          for(int i = 0; i < str.length(); i++) {
        	  char currentChar = str.charAt(i);
        	  if(currentChar != symbol) {
        		  result.append(currentChar);
        	  }
          }
		return result.toString();
	}
}
