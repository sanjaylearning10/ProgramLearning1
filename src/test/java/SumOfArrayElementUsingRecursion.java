public class SumOfArrayElementUsingRecursion {

    public static int Sum(int[] array,int i)
    {
        int result=0;

        if(i>=array.length)
        {
            return result;
        }
       result=array[i]+Sum(array,i+1);
        return result;
    }

    public static void main(String...args){
      int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Sum(array,0));
    }
}
