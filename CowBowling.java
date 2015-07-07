import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] lists = new int[n][];
		for(int i = 0; i < n; i ++) {
			lists[i] = new int[i+1];
			for(int j = 0; j <= i; j++) {
					lists[i][j] = scan.nextInt();
			}
		}
		Main test = new Main();
		System.out.println(test.max(n, lists));
	}
	
	public int max(int n, int[][] rows) {
		if(n <= 0) return 0;

		for(int i = n - 2; i >= 0; i --) {
			for(int j = 0; j < i+1; j++) {
				rows[i][j] = rows[i][j] + Math.max(rows[i+1][j], rows[i+1][j+1]);
			}
		}
		return rows[0][0];
	}
}

/*
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Integer>[] lists = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			lists[i] = new ArrayList<Integer>();
			for(int j = 0; j <= i; j++) {
					lists[i].add(scan.nextInt());
			}
		}
		Main test = new Main();
		System.out.println(test.max(n, lists));
	}

	public int max(int n, ArrayList<Integer>[] rows) {
		if(n <= 0) return 0;
		if(n == 1) return rows[0].get(0);
		return maxPath(rows, 0, 0);
	}

	private int maxPath(ArrayList<Integer>[] rows, int row, int index) {
		if(row >= rows.length) return 0;
		return rows[row].get(index) + Math.max(maxPath(rows, row+1, index), maxPath(rows, row+1, index+1));
	}
}
*/
