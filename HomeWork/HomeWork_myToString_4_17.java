public class HomeWork_myToString_4_17 {
    public static void main(String[] args) {
        int [] arr= {1,2,3,54,9,56,465,56,87};
        System.out.println(myToString(arr));

    }

    public static String myToString(int [] arr){
        if (null == arr){
            return "null";
        }

        String ret ="[ ";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length-1){
                ret += ", ";
            }
        }
        ret += " ]";
        return ret;

    }
}