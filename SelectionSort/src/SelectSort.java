
public class SelectSort {
	private long[] a;
	private int nElems;
	
	public SelectSort(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(int value){
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for (int i=0;i<nElems;i++) {
			System.out.print(a[i] + " ");
		System.out.println();	
		}
	}
	
	public void selectionSort(){
		
		long min, high, temp = 0;
		for(int i = 0; i<nElems; i++) {
			min = a[i];
			for (int j = i+1; j<nElems; j++ ) {
				if (a[j] < min) {
					min = a[j];
					temp = a[i];
					a[i] = min;
					a[j] = temp;
				}
			}
		}
			
		
	}
	
	
	public static void main(String[] args) {

		int maxSize = 100;
		SelectSort arr2 = new SelectSort(maxSize);
		arr2.insert(10);
		arr2.insert(9);
		arr2.insert(8);
		arr2.insert(7);
		arr2.insert(6);
		arr2.insert(5);
		arr2.insert(4);
		arr2.insert(3);
		arr2.insert(2);
		arr2.insert(1);
		
		arr2.selectionSort();
		arr2.display();
	}

}
