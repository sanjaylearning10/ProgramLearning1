public class FindMissingElementInNotNaturalSortedArray {

    public static void main(String...args)
    {
        int[] array ={7,8,9,10,11,12,13,15,16,17,18};

        int firstElement=array[0];
        int lastElement=array[0]+array.length-1;
        System.out.println("lastElement: "+lastElement);

        int diff=array[0]-0;

        for(int i=0;i<array.length;i++)
        {
            if(array[i]-i!=diff)
            {
                System.out.println("Missing number is "+ (diff+i));
                break;
            }
        }





    }

}
