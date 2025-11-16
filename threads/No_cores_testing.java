class No_cores_testing{
	public static void main(String[] args){
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount);
		char[] c = new char[]{'a',' ',' ',' ','b','c'};
		//c = {'a',' ',' ',' ','b','c'};
		System.out.println(c[0]);
	}
}
