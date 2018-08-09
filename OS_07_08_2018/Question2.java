
public class Question2 {
	private Heap testHeap;
	
	private float median; 
		
	public Question2(int[] num_array) {
		this.testHeap = new Heap(num_array);
		this.median=0;
		
		testHeap.HeapSort(num_array);
	}
	
	public void add(int num) {
		this.testHeap.insert(num);
	}
	
	public float getMedian() {
		if(this.testHeap.length%2==0) {
			this.median=this.testHeap.A[this.testHeap.length/2];
		}
		else {
			int index1=(this.testHeap.length+1)/2;
			int index2=(this.testHeap.length-1)/2;
			
			this.median=(float) (((this.testHeap.A[index1])+(this.testHeap.A[index2]))/2.0);
		}
		
		return this.median;
	}
	
	public static void main(String[] args) {
		
		//int [] arreglo0 = {2,4,6,8,1,3,5,7,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		int [] arreglo1= {2,4,6,8,1,3,5,7,9,10};
		
		Question2 q2= new Question2(arreglo1);
		
		//Get the median
		System.out.println("Median: "+q2.getMedian());
		//Add
		q2.add(2);
		q2.add(7);
		System.out.println("Heap: "+q2.testHeap);
	}

}
