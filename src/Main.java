import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the number of Strings");
        int length = kb.nextInt();
        String stringArray [] = new String[length];
        for(int i =0; i<length;i++){
            stringArray[i] = kb.next();
        }
        System.out.println("The longest common prefix the set of strings has is "+longestCommonPrefix(stringArray));
    }
    public static  String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int index = 0;
        String one = strs[0];
        String two = strs[strs.length-1];
        while(one.length()>index&&two.length()>index){
            if(one.charAt(index)==two.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return one.substring(0,index);
    }

}