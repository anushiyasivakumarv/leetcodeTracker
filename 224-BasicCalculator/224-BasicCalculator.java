// Last updated: 09/07/2026, 09:18:26
class Solution {
    int index = 0;
    public int calculate(String s) {
        return solve(s);
    }
    private int solve(String s) {
        int result = 0;
        int number = 0;
        int sign = 1;
        while (index < s.length()) {
            char ch = s.charAt(index);
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            }
            else if (ch == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            }
            else if (ch == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            }
            else if (ch == '(') {
                index++;
                number = solve(s);
            }
            else if (ch == ')') {
                result += sign * number;
                return result;
            }
            index++;
        }
        return result + sign * number;
    }
}