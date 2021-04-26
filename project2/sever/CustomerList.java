package day10.myproject.sever;

import day10.myproject.bean.Customer;

public class CustomerList {
    private Customer[] customers;   //保存客户对象的数组
    private int total = 0;      //记录已保存客户的数量

    /**
     * 用来初始化customer数组的构造器
     * @param totalCustomer : 指定数组的长度
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * 将指定的用户添加到数组中
     * @param customer
     * @return true添加成功   false 添加失败
     */
    public boolean addCustomer(Customer customer){

        if(total >= customers.length){
            return false;
        }
        customers[total++] = customer;
       // total++;
        return true;
    }

    /**
     * 修改指定索引位置的客户信息
     * @param index
     * @param cust
     * @return  true:修改成  false:修改失败
     */
    public boolean replaceCustomer(int index , Customer cust){
        if(index <0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定索引位置上的用户
     * @param index
     * @return  true : 删除成功  false : 删除失败
     */
    public boolean deleteCustomer(int index){
        if(index <0 || index >= total){
            return false;
        }
        for (int i = index; i < total -1 ; i++) {
            customers[i] = customers[+1];
        }
//        customers[total-1] = null;
//        total--;
        //或
        customers[--total] = null;
        return true;
    }

    /**
     * 获取所有位置的信息
     * @return
     */
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i <total ; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定位置上的元素
     * @param index
     * @return 如果找到了则返回;如果没找到,则返回null
     */
    public Customer getCustomer(int index){
        if (index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储用户的数量
     * @return
     */
    public int getTotal(){
        return total;
    }
}
