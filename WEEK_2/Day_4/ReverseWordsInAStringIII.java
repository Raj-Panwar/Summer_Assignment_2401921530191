package WEEK_2.Day_4;

class Solution {
    public String reverse(String s){
        char[] a = s.toCharArray();
        int i =0;
        int j = a.length-1;
        while(i<j){
            char temp = a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return new String(a);

    }
    public String reverseWords(String s) {
        String[] ar = s.split(" ");
        for(int i =0; i<ar.length; i++){
            ar[i] = reverse(ar[i]);

        }
        return String.join(" ", ar);
    }
}