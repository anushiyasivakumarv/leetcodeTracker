// Last updated: 9/8/2026, 2:21:54 PM
1class Solution {
2    public String complexNumberMultiply(String num1, String num2) {
3
4        StringBuilder sb1 = new StringBuilder();
5        StringBuilder sb2 = new StringBuilder();
6        StringBuilder sb3 = new StringBuilder();
7        StringBuilder sb4 = new StringBuilder();
8
9        int i = 0;
10
11        while (num1.charAt(i) != '+') {
12            sb1.append(num1.charAt(i));
13            i++;
14        }
15        i++;
16
17        while (num1.charAt(i) != 'i') {
18            sb2.append(num1.charAt(i));
19            i++;
20        }
21
22        i = 0;
23        while (num2.charAt(i) != '+') {
24            sb3.append(num2.charAt(i));
25            i++;
26        }
27        i++;
28
29        while (num2.charAt(i) != 'i') {
30            sb4.append(num2.charAt(i));
31            i++;
32        }
33
34        int a = Integer.parseInt(sb1.toString());
35        int b = Integer.parseInt(sb2.toString());
36        int c = Integer.parseInt(sb3.toString());
37        int d = Integer.parseInt(sb4.toString());
38
39        int real = a * c - b * d;
40        int imag = a * d + b * c;
41
42        return real + "+" + imag + "i";
43    }
44}