package SessionTrainings;
public class ArrayRelations {
	public static void main(String args[]) {
		int numbers[][]= {{2,4,5},{3,2,7},{1,2,9}};
		int smallestNumber=0;
		int temp;
		int count=0;
		for(int i=0;i<3;i++) {
			count=0;
			for(int j=0;j<3;j++) {
				temp=numbers[i][j];
				for(int k=0;k<3;k++) {
					for(int l=0;l<3;l++) {
						if(temp<=numbers[k][l]) {
							count++;
						}
					}
				}		
				if(count==9) {
					smallestNumber=temp;
				}
			}
			
		}
		System.out.println("Smallest Number:"+smallestNumber);
	}
}

