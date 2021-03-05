package SessionTrainings;

public class ArrayDemo {
	
	public static void main(String args[]) {
	
	int arr[][]= {{1,1,1,1,1,1},{2,2,2,2,2,2},{3,3,3,3,3,3},{4,4,4,4,4,4},{5,5,5,5,5,5},{6,6,6,6,6,6}};
	int maxvalue=0;
	for(int i =0;i<6;i++) {
		for(int j=0;j<6;j++) {
			System.out.print(arr[i][j]);
		}
		System.out.println();
	}
	for(int i =0;i<4;i++) {
		for(int j=0;j<4;j++) {
			int tempValue=0;
			tempValue=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
			if(tempValue>maxvalue) {
				maxvalue=tempValue;
			}
		}
		
	}
	System.out.println("Maximum Value:"+maxvalue);
	
	}
}
