
public class findMaxIndex {
	public static void main(String[] args) {
		double[] array = {1000.8, 1000.8, 1.0, 140.7};// testing for if there are two highest
		System.out.println(findMaxIndex(array)+" is the max index value of " + array[findMaxIndex(array)]);
	}
		
	
	public static int findMaxIndex(double[] currentArray) {
	        int maxIndex = 0;
	        double maxValue = currentArray[0];
	        // can be used on any numbered array in case we wanted to use it on MHR or BMI
	        for (int i = 1; i < currentArray.length; i++) {
	            
	        	if (currentArray[i] > maxValue) {
	                maxValue = currentArray[i];
	                maxIndex = i;
	            }
	        }
	        return maxIndex;
		}
}
