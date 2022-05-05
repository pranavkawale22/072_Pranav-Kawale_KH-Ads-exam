class Sorting{
		
	void insertionsort(int a1[], int n){	
		
		for(int i = n ;i>0;i--){
			
			int x = a1[i-1];
			int j = i-2;
			
			while (j >= 0 && a1[j] > x){
				a1[j+1] = a1[j];
				j = j-1;
			for (int k = 0;k<n;k++){
			System.out.print(a1[k]+" ");				
			}
			System.out.println();
			}
			a1[j+1] = x;
			
		}

	} 
	public static void main(String []args){
		int n = 5;	
		int a1[] = new int[n];
		a1[0] = 2;
		a1[1] = 4;
		a1[2] = 6;
		a1[3] = 8;
		a1[4] = 3;
		
		Sorting q = new Sorting();
		q.insertionsort(a1,n);
		for (int k = 0;k<n;k++){
			System.out.print(a1[k]+" ");				
			}	
	}
}