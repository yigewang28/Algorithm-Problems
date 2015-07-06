
public class LongestPalindrome {
	public int count(String s) {
		if(s == null || s.length() == 0) return 0;
		if(s.length() == 1) return 1;
		int max = 1;
		boolean[][] isPalindrome = new boolean[s.length()][s.length()];
		for(int i = 0; i < s.length(); i ++) {
			isPalindrome[i][i] = true;
		}
		for(int i = 1; i < s.length(); i ++) {
			for(int j = 0; j <= s.length() - i - 1; j ++) {
				if(i == 1) {
					if(s.charAt(j) == s.charAt(j+i)) {
						isPalindrome[j][j+i] = true;
						max = 2;
					}
					else {
						isPalindrome[j][j+i] = false;
					}
				}
				else {
					if(s.charAt(j) == s.charAt(j+i)) {
						isPalindrome[j][j+i] = isPalindrome[j+1][j+i-1];
						if(isPalindrome[j][j+i]) {
							max = i + 1;
						}
					}
					else {
						isPalindrome[j][j+i] = false;
					}
				}
			}
		} 
		return max;

	}
}
