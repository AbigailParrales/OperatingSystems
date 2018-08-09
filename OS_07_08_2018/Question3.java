import java.util.Random;

public class Question3 {
	private int N;
	private int random;
	private BST<Integer, String> bT;

	public Question3(int N,int[] givenList) {
		this.N=N;
		this.random=new Random().nextInt(N);
		this.bT= new BST<Integer,String>();
		for(int i=0;i<givenList.length;i++) {
			this.bT.add(givenList[i], "");
		}
	}

	public int getRandom() {
		this.random=new Random().nextInt(N);
		return this.random;
	}
	
	public int getMissingNum() {
		while(this.bT.contains(this.random)) {
			getRandom();
		}
		
		return random;
	}
	
	public static void main(String[] args) {
		int[] a= {1,2,4,6,7,9};
		Question3 q3=new Question3(10, a);
		System.out.println(q3.getMissingNum());

	}

}
