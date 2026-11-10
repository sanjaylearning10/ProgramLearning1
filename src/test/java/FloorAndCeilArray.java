public class FloorAndCeilArray {

    public static int floorArray(int[] array,int num) {
        if(array[0]<num && (array[array.length-1]>num)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) {
                    return array[i];
                } else if (array[i] > num) {
                    return array[i - 1];
                }
            }
        }
        else if (array[array.length-1]<num)
            return array[array.length-1];
        else
            return -1;
        return -1;
    }
    public static int ceilArray(int[] array,int num) {
        if(array[0]<num && (array[array.length-1]>num)) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] == num) {
                    return array[i];
                } else if (array[i] < num) {
                    return array[i + 1];
                }
            }
        }
        else if (array[array.length-1]<num)
            return -1;
        else
            return -1;
        return -1;
    }
    public static void main(String...args)
    {
        int[] array={11,22,33,44,55,66,77,88,99,100,200};
        int num=122;
        //System.out.println(floorArray(array,num));
        System.out.println(ceilArray(array,num));
    }

}
