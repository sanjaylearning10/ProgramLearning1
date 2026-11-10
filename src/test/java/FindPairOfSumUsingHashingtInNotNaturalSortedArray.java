import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class FindPairOfSumUsingHashingtInNotNaturalSortedArray {

    public static void main(String...args)
    {
        int[] array ={6,3,8,10,16,7,5,2,9,14};
        int[] temp =new int[17];
        int k=10;

        for (int i =0;i<array.length;i++)
        {
            try {
                if ((temp[k - array[i]]) != 0) {
                    System.out.println("Provided numbers are:: " + array[i] + " " + (k - array[i]));
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
            }
            temp[array[i]]++;
        }
    }
}
