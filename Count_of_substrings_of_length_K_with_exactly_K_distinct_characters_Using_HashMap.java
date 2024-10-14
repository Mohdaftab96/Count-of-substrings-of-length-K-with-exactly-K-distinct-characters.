

// Enter the String : aabab
// Enter the k length : 3
// Count of substrings of length K with exactly K distinct characters is : 0


// Enter the String : abcc
// Enter the k length : 2
// Count of substrings of length K with exactly K distinct characters is : 2


import java.util.Scanner;
import java.util.HashMap;

public class Count_of_substrings_of_length_K_with_exactly_K_distinct_characters_Using_HashMap {

      static int count = 0;

      static int countSubstring(String str, int k){
            int n = str.length();

            for(int i=0; i<n-k+1; i++){
                  String s = str.substring(i, i+k); // ab bc cc are substring

                  HashMap<Character, Integer> map = new HashMap<>();

                  for(char c: s.toCharArray()){
                        map.put(c, map.getOrDefault(c, 0) + 1);
                  }

                  if(map.size() == k ){
                        count = count + 1;
                  }
            }
            return count;
      }






      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the String : ");
            String str = sc.next(); // str=abcc

            System.out.print("Enter the k length : ");
            int k = sc.nextInt(); // k = 2

            // countSubstring(str, k);

            System.out.print("Count of substrings of length K with exactly K distinct characters is : " + countSubstring(str, k));
      }
}
