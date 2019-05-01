

public class Sequence {
	
		public static void main(String[] args){
		
		String sequence = "abbbcabcdefaaaaaaaaaabcdefghiaazaal";
		char[] charArray = sequence.toCharArray();
		char resChar = ' ' ;
		for(int i=1; i<sequence.length();i++) {
			if(charArray[i-1]!= charArray[i]) {
				resChar = charArray[i-1];
			}
			System.out.print(resChar);
		}
		//System.out.println(resChar);
	}	 

}
