public class HomeWorkBinaryResearch_4_17 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,25,36,39,56,58,59,96,98};
        int ret = binarySearch(arr,39);
//        System.out.println(ret);
        if (ret != -1){
            System.out.println("找到了,数据下标为:"+ ret);
        }

    }

    public static int binarySearch(int [] arr,int find){
        HomeWork_isOrder_4_17  isOrder = new HomeWork_isOrder_4_17();
        boolean choice = isOrder.isOrder(arr);
        if (!choice){
            System.out.println("数组无序,不能进行二分查找!");
            return -1;
        }

        int left =0;
        int right = arr.length-1;


        while(left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] > find){
                right = mid -1;
            }else if(arr[mid] < find){
                left = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}