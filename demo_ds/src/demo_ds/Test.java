package demo_ds;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		System.out.println(getPositiveCumulativeSum(a));
	}
	static List<Integer> getPositiveCumulativeSum(int[] arr) {
		// add your logic here
		List<Integer> l=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			int n=0;
			for(int j=0;j<=i;j++){
				n=n+arr[j];
			}
			l.add(n);
		}
		return l.stream().filter(n->n>0).collect(java.util.stream.Collectors.toList());
		
	}

}
