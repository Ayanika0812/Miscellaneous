/*Input: s = "abccbaacz"
Output: "c"
Explanation:
The letter 'a' appears on the indexes 0, 5 and 6.
The letter 'b' appears on the indexes 1 and 4.
The letter 'c' appears on the indexes 2, 3 and 7.
The letter 'z' appears on the index 8.
The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.

Example 2:
Input: s = "abcdd"
Output: "d"
Explanation:
The only letter that appears twice is 'd' so we return 'd'.
*/


class Solution{
  public char repeatedCharacter(String s){

    HashSet<Character> seen = new HashSet<>();

    for(char c : s.toCharArray()){

      if(seen.contains(c)){
          return c;
      }
      else{
          seen.add(c);
      }
    }
    return '\0';
  }
    
}  
