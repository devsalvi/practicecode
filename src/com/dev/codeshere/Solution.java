package com.dev.codeshere;
// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
class Solution extends Thread {
	// public int solution(int N) {
	// int binaryGap = 0;
	// int tempGap = 0;
	// boolean lastcounted = false;
	// String binaryN = Integer.toBinaryString(N);
	// for(int i=0; i< binaryN.length(); i++) {
	// if(binaryN.charAt(i) == '1') {
	// if(lastcounted) {
	// lastcounted = false;
	// if(tempGap > binaryGap) {
	// binaryGap = tempGap;
	// }
	// tempGap =0;
	// }
	// }
	// else{
	// lastcounted = true;
	// tempGap ++;
	// }
	// }
	//
	// return binaryGap;
	// }

	// public int[] solution(int[] A, int K) {
	// int[] tempArray = new int[A.length * (K+1)];
	// int[] resultArr = new int[A.length];
	//// for(int i=0; i < K; i++) {
	//// resultArray[i] = A[A.length - K + i];
	//// }
	//// for(int i = K ; i < A.length; i++) {
	//// resultArray[i] = A[i - K];
	//// }
	// for(int i=0,j=0; i< A.length * (K + 1); i++,j++) {
	//
	// tempArray[i] = A[j];
	// if(j == A.length -1){j=-1;}
	// }
	//
	// for(int i = tempArray.length - A.length -K,j=0; j< A.length; i++,j++){
	// resultArr[j] = tempArray[i];
	// }
	//
	// return resultArr;
	// }

	@Override
	public void run() {
		System.out.println(":" + Thread.currentThread().getPriority() + ":" + Thread.currentThread().getThreadGroup()
				+ ":" + Thread.currentThread().getState());
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] A = { 1, -2, 0, 9, -1, -2 };
		int K = 1;
		// int[] res = s.solution(A, K);
		// for(int i : res) {
		// System.out.println(i);
		// }
		// System.out.println(s.solution(66561));
		// long id = Thread.currentThread().getId();
		// String name = Thread.currentThread().getName();
		// s.start();
		// System.out.println(id + ":" + name + ":" +
		// Thread.currentThread().getPriority() + ":" +
		// Thread.currentThread().getThreadGroup() + ":" +
		// Thread.currentThread().getState());
		System.out.println(s.solution(A));
	}

	public int solution(int[] A) {
		if (A.length == 1)
			return A[0];
		int k = 1;
		int sum = A[0];
		int n = A.length;
		for (int i = 0; i < n; i++) {
			while (i + k < n - 1) {
				sum = Math.max(sum, sum + A[i + k]);
				k++;
			}

		}
		return sum + A[n-1];
	}
}