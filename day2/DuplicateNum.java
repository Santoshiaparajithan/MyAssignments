package week1.day2;

public class DuplicateNum {

	public static void main(String[] args) {
		
		//initialize array
		int[] array=new int[] {2,5,7,7,5,9,2,3};
		System.out.println("Duplicate numbers : ");
		
		//Search for duplicate num
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j])
					System.out.println(array[j]);
			}
		}

	}

}
