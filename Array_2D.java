package arrays;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] arr = 
			{
			{"A","B","C"},
			{"E","F"},
			{"SDF","FG","FG","JH"}
			};			
	
	System.out.println(arr.length);
	System.out.println(arr[2].length);
	
	System.out.println(arr[2][1]);
	arr[2][1] = "AAAA";
	System.out.println(arr[2][1]);
	
	for(String[] x : arr) {
		for(String y : x) {
			System.out.println(y);
		}
		System.out.println("----------------------");
	}

	}

}
