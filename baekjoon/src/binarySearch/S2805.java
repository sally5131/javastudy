package binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class S2805 {

	 public static void main(String[] args) throws Exception {
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = null;
	        
	        int[] a = new int[2];
	        st = new StringTokenizer(br.readLine());
	        for(int i = 0; i < a.length; i++) {
	        	a[i] = Integer.parseInt(st.nextToken());
	        } // a의 첫번째 요소 : 나무의 수, a의 두번째 요소 : 가져갈 나무의 길이
	        
	        ArrayList<Integer> list = new ArrayList<>();
	        st = new StringTokenizer(br.readLine());
	        for (int i = 0; i < a[0]; i++) {
	        	list.add(Integer.parseInt(st.nextToken()));
	        }
	        Collections.sort(list);
	        
	        ArrayList<Integer> list2 = new ArrayList<Integer>();
	        for (int i = list.get(0); i <= list.get(a[0] - 1); i++) {
	        	list2.add(i);
	        }
	        
	 
	        int pos, left, right, middle, sum;
	        
	        pos = -1;
	        left = 0;
	        right = list2.size() - 1;
	        
	        while(pos == -1 && left <= right) {
	        	middle = (left + right) / 2;
	        	sum = 0;
	        	
	        	for(int i = 0; i < list.size(); i++) {
	        		if((list.get(i) - list2.get(middle)) > 0) {
	        			sum += (list.get(i) - list2.get(middle));
	        		}
	        	}
	        	
	        	if(sum == a[1]) {
	        		pos = middle;
	        	}else if(sum > a[1]){
	        		left = middle + 1;
	        	}else {
	        		right = middle - 1;
	        	}
	        }
	        	System.out.print(list2.get(pos));
	        
	        
	    }
	 
}
