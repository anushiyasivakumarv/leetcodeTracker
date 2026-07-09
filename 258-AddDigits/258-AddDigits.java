// Last updated: 09/07/2026, 09:18:21
class Solution {
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;  
            num /= 10;        
        }
        return addDigits(sum);
    }
}