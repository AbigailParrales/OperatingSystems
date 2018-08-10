import javax.swing.JOptionPane;

/**
 * @author Daniela Parrales
 * A01228629
 * 09/August/2018
 */

public class Question2 {
	private Heap testHeap;

	private float median; 

	public Question2() {
		this.testHeap = new Heap(10);
		this.median=0;
	}

	public Question2(int[] num_array) {
		this.testHeap = new Heap(num_array);
		this.median=0;

		testHeap.HeapSort(num_array);
	}

	public void add(int num) {
		this.testHeap.insert(num);
	}

	public float getMedian() {
		if((this.testHeap.size+1)%2==0) {
			this.median=this.testHeap.A[(this.testHeap.size+1)/2];
		}
		else {
			int index1=(this.testHeap.size+2)/2;
			int index2=(this.testHeap.size)/2;

			this.median=(float) (((this.testHeap.A[index1])+(this.testHeap.A[index2]))/2.0);
		}

		return this.median;
	}

	public static void main(String[] args) {
		boolean open=true;
		//int [] arreglo0 = {2,4,6,8,1,3,5,7,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
		//int [] arreglo1= {2,4,6,8,1,3,5,7,9,10};

		//Question2 q2= new Question2(arreglo1);
		Question2 q2= new Question2();

		
		while(open) {
			String[] options= {"Insert new number","Get the Median","Salir"};
			int sel=JOptionPane.showOptionDialog(null, "Mensaje", "Question2",0, 0, null, options, options);
			switch (sel) {
			case 0:
				int num=Integer.parseInt(JOptionPane.showInputDialog("Inserte un número"));
				q2.add(num);
				break;

			case 1:
				q2.testHeap.HeapSort(q2.testHeap.A);
				
				long startTime = System.nanoTime();
				
				float median=q2.getMedian();
				
				long stopTime = System.nanoTime();
				System.out.println(stopTime - startTime+" nano seconds");
				
				JOptionPane.showMessageDialog(null, "Median: "+median, "Median", 0);
				break;

			case 2:
				open=false;
				break;
			default:
				break;
			}

		}
	}

}
