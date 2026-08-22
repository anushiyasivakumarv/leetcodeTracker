// Last updated: 8/22/2026, 4:27:18 PM
class Solution {

public static int[] closestDivisors(int num) {

		int ans[] = new int[2];
		int mindiff =  Integer.MAX_VALUE;


		for (int i = num + 1; i <= num + 2; i++) {

			for (int j = 1; j*j <= i; j++) {

				if(i % j == 0) {
					int a = j;
					int b = i / j;

					int diff = Math.abs(a - b);

					if(diff < mindiff) {
						mindiff = diff;
						ans[0]=a;
						ans[1]=b;
					}

				}



			}

		}

		return ans;
	}

}