package bitManipulation;

//O(1),O(1)

public class ReverseBits {
	
	 public static int reverseBits(int n) {
	        int res=0;
	        for(int i=0;i<32;i++){
	            
	            //left shift 
	            res<<=1;
				// & to get the last bit of n , | to add to the res
				res |= n & 1;
				// right shift
				n >>= 1;

			}
			return res;
	            
	    }
	 
	public static void main(String[] args) {
		
		int n=964176192;//0101=5
		System.out.println(reverseBits(n));
	}

}
