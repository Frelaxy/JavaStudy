package Bubble;

class Bubble {
	public static void main(String args[]) {
		char nums[] = { 'A', 'C', 'Z', 'R', 'E', 'B' } ;
		int a,b;
		char t;
		int size;
		size = 6; 
		System.out.print("Иcxoдный массив:");
		for(int i=0; i < size; i++)
			System.out.print(" " + nums[i]);
		System.out.println();

		for(a=1; a< size; a++)
			for (b=size-1; b >= a; b--) {
				if(nums[b-1] > nums[b]) { 
					t = nums[b-1];
					nums[b-1] = nums[b];
					nums[b] = t;

					System.out.print("Oтcopтиpoвaнный массив:");
					for(int i=0; i < size; i++)
						System.out.print(" " + nums[i]);
					System.out.println();
				}
			}
	}
}