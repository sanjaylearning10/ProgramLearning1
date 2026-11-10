public class ReverseWordsOfStringWithOutNewArray {
    public static void main(String...args)
    {
        String s ="hello world";
        String[] strArray=s.split(" ");

       for(int j=0;j<strArray.length;j++) {
           char[] array=strArray[j].toCharArray();
           for (int i = array.length - 1; i > -1; i--) {
               System.out.print(array[i] + " ");
           }
       }
    }
}
