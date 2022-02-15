package binarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
 
public class S1920 {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
 
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
        	list.add(Integer.parseInt(st.nextToken()));
        }
        
        Collections.sort(list);
        
        int m = Integer.parseInt(br.readLine());
        ArrayList<Integer> list2 = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
        	list2.add(Integer.parseInt(st.nextToken()));
        }
        
        int x, pos, left, right, middle;
        
        for(int i = 0; i < list2.size(); i++) {
        	x = list2.get(i);
        	pos = 0;
        	left = 0;
        	right = n-1;
        	while(pos == 0 && left <= right) {
        		middle = (left + right) / 2;
        		if(list.get(middle) == x) {
        			pos = 1;
        		}else if(list.get(middle) < x) {
        			left = middle + 1;
        		}else {
        			right = middle - 1;
        		}
        	}
        	System.out.println(pos);
        }   
    }
}
