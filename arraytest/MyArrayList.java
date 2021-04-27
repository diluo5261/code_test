import java.util.Arrays;

/**
 *
 */
public class MyArrayList {
    public int [] elem;  //不建议在这里初始化
    public int usedSize; //有效的数据个数

    //静态代码用的比较少,用的比较多的是构造方法

    public MyArrayList(){
        this.elem = new int[10];
    }

    public boolean isFull(){
        if (this.usedSize == elem.length){
            return true;
        }
        return false;
    }

    public void add (int pos , int data){

        if (isFull()){
            this.elem = Arrays.copyOf(elem,this.elem.length*2);
        }

        if (pos < 0 || pos > usedSize){
            System.out.println("输入数据不合法");
            return ;
        }


        for (int i = usedSize-1; i >=pos ; i--) {
            elem[i+1] = elem[i];
        }

        elem[pos] = data;
        usedSize++;
    }

    /**
     * 盘算是否包含某个元素
     * @param toFind
     * @return  true 存在   false  不存在
     */
    private boolean contains(int toFind){
        for (int i = 0; i <this.usedSize ; i++) {
            if(toFind == this.elem[i]){
                return true;
            }
        }
        return false;
    }

    /**
     * 遍历数组
     */
    public void display(){
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    /**
     * 查找某个元素对应的位置,
     * @param toFind
     * @return 找到返回对应的位置,-1找不到
     */
    public int search (int toFind){

        //找到返回对应下标
        for (int i = 0; i <this.usedSize ; i++) {
            if (toFind == this.elem[i]){
                return i;
            }
        }
        return -1;
    }

    public void remove(int key){
        int i = 0;
        for (; i <this.usedSize ; i++) {
            if(this.elem[i] == key){
                break;
            }
        }

        for (; i <this.usedSize-1 ; i++) {
            this.elem[i] = this.elem[i+1];
        }

        this.usedSize--;
    }

    /**
     * 获取当前位置上的数据
     * @param pos
     * @return 成功:返回当前位置的值   失败:返回-1
     */
    public int getPose(int pos){
        if (pos < 0 || pos >= this.usedSize){
            return -1;
        }
        return this.elem[pos];
    }

    /**
     * 获取当前顺序标中的元素
     * @return
     */
    public int size(){
        return this.usedSize;
    }

    /**
     * 将pos位置的值修改为:data
     * @param pos
     * @param data
     */
    public void setPos(int pos ,int data){
        if (pos < 0 || pos >= this.usedSize){
            System.out.println("pos不合法");
            return;
        }
        this.elem[pos] = data;
    }

    public void clear(){
        this.usedSize=0;
    }
}
