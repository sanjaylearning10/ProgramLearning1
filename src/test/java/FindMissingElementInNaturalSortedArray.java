public class FindMissingElementInNaturalSortedArray {

    public static void main(String...args)
    {
        int[] array ={0,1,2,3,4,5,7,8,9,10};
        int actualSum=0;
        int expectedSum=0;

        for(int i=0;i<11;i++)
        {
            expectedSum=expectedSum+i;
        }

        for(int i=0;i<array.length;i++)
        {
            actualSum=actualSum+array[i];
        }

        System.out.println("Missing Number is "+ (expectedSum-actualSum));
    }

}
