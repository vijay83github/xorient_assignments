package com.xorient.test.q3;

public class MergeSort {
	public void merge(int[] A, int[] B, int[] C) {
		int i, j, k, m, n;
		i = 0;
		j = 0;
		k = 0;
		m = A.length;
		n = B.length;
		if (A[m - 1] > B[0]) {
			while (i < m && j < n) {
				if (A[i] <= B[j]) {
					C[k] = A[i];
					i++;
				} else {
					C[k] = B[j];
					j++;
				}
				k++;
			}
			if (i < m) {
				for (int p = i; p < m; p++) {
					C[k] = A[p];
					k++;
				}
			} else {
				for (int p = j; p < n; p++) {
					C[k] = B[p];
					k++;
				}
			}
		} else {
			for (int p = i; p < m; p++) {
				C[k] = A[p];
				k++;
			}
			for (int p = j; p < n; p++) {
				C[k] = B[p];
				k++;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();
		int A[] = {1,2,3,4,6};
		int B[] = {5,7,8,9,10};
		int C[] = new int[10];
		mergeSort.merge(A,B,C);
		
		int D[] = {1,2,3,4,5};
		int E[] = {6,7,8,9,10};
		mergeSort.merge(D,E,C);
		
		for (int i : C) {
			System.out.print(i+ " ");
		}
		
	}

}
