public class DuplicateElemenUsingHashingtInNotNaturalSortedArray {

    public static void main(String...args)
    {
        int[] array ={7,8,10,11,12,13,16,13,9,8,17,18,13,9,9};
        int[] temp =new int[19];

        for (int i =0;i<array.length;i++)
        {
            temp[array[i]]++;
        }
        for(int i=7;i<temp.length;i++)
        {
            if(temp[i]<1) {
                System.out.println("Missing number of element is " +i);
            }
            else if (temp[i]>1)
            {
                System.out.println("Duplicate number of element is " +i+" "+temp[i]);
            }
        }
    }
}
