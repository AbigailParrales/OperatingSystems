public class Question1 {
	private String original_string;
	
	public Question1(String word) {
		this.original_string=word;
	}
	
	
	private Character scan_string() {
		Character car = null;
		CharSequence ch_seq;
		
		String left_string;
		String right_string;
		
		int i=0;
	
		
		while(i<this.original_string.length()) {
			//Obtain first letter
			car = this.original_string.charAt(i);
			ch_seq=car.toString();
			
			//Creates two substrings to check if the letter in the pointer i exists to its right or to its left
			right_string=original_string.substring(i+1);
			left_string=original_string.substring(0,i);
			
			if(left_string.contains(ch_seq) || right_string.contains(ch_seq)) {
				i++;
			}
			else {
				return car;
			}
			
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		/*Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string: ");
		Question1 my= new Question1(reader.next());*/
		
		Question1 my= new Question1("abigail");
		//reader.close();
		System.out.println(my.scan_string());
		//System.out.println(my.original_string);
	}

}
