package input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class start {
    // BufferedReader�� Exception�� ó���� ���� ����� �ϱ� ������ throws�� ���ְų� 
    // try ~ catch�� ����ó���� ������մϴ�.
    public static void main(String[] args) throws Exception {
        // BufferedReader ��ü ����
        // new InputStreamReader �� System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        // StringTokenizer ��ü ����
        StringTokenizer st = null;
 
        // String Line�̹Ƿ� Integer.parseInt�� �̿��Ͽ� ����ȯ�ؾ���
        int n = Integer.parseInt(br.readLine());
 
        // "1 3 5 7" ������ ���� ���� String Line�Ͻ� StringTokenizer �̿�
        int[] arrays = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            // �迭���� ��ū�� �ϳ��� �ҷ��� �Է�����
            arrays[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 1; i <= n; i++) {
            // �迭���� ��ū�� �ϳ��� �ҷ��� �������
        	System.out.print(arrays[i] + " ");
        }
       
        
    }
}
