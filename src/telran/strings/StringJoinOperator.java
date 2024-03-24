package telran.strings;

public class StringJoinOperator implements StringsJoin {

	@Override
	public String joinStrings(String[] array, String delimeter) {
        String string = array[0];
        for(int i = 1; i < array.length;i++) {
        	string += delimeter + array[i];
        }
		return string;
	}
}
