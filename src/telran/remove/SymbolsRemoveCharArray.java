package telran.remove;

public class SymbolsRemoveCharArray implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {
      char [] charArray = str.toCharArray();
      
      char[] newArray = new char[charArray.length];
      int newIndex = 0;
      for(char c : charArray) {
    	  if(c != symbol) {
    		  newArray[newIndex++] = c;
    	  }
      }
		return new String(newArray, 0, newIndex);
	}
 
}