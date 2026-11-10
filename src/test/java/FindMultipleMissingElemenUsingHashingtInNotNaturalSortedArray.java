public class FindMultipleMissingElemenUsingHashingtInNotNaturalSortedArray {

    public static void main(String...args)
    {
        int[] array ={7,8,10,11,12,13,16,17,18};
        int[] temp =new int[19];

        for (int i =0;i<array.length;i++)
        {
            temp[array[i]]++;
        }
        for(int i=7;i<temp.length;i++)
        {
            if(temp[i]!=1) {
                System.out.println("Missing number of element is " +i);
            }
        }
    }
}
