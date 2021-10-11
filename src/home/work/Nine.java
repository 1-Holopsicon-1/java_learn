package home.work;

class Nine{
	public static int[] nineTask(int[] arr1, int[]arr2){
	  int[] out = new int[arr1.length + arr2.length];
	  for (int i = 0; i < arr1.length; i++){
		  out[i] = arr1[i];
	  }
	  for (int i = 0; i < arr2.length; i++){
		  out[i + arr1.length] = arr2[i];
	  }
	  return out;
  }
}