package home.work;

class Ten{
	public static int[] tenTask(int[] arr){
		int firstLast = arr[0];
		int lastFirst = arr[arr.length - 1];
		int[] arr_ret = arr.clone();
		arr_ret[0] = lastFirst;
		arr_ret[arr.length - 1] = firstLast;
		return arr_ret;
  }
}