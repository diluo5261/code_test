package day10.myproject.view;

import day10.myproject.bean.Customer;
import day10.myproject.sever.CustomerList;
import day10.myproject.util.CMUtility;

/**
 * CustomerView 为主模块,负责菜单的显式和处理用户操作
 *
 * */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);


    public CustomerView(){
        Customer customer = new Customer("张三","男",24,"13512341234","4646@qq.com");
        customerList.addCustomer(customer);

    }

    /**
     * 显式客户信息管理界面的方法
     */
    public void enterMainMenu(){
        boolean isflag = true;
        while(isflag){

            System.out.println("----------------------客户信息管理软件----------------------");
            System.out.println("                       1添加客户");
            System.out.println("                       2修改客户");
            System.out.println("                       3删除客户");
            System.out.println("                       4客户列表");
            System.out.println("                       5退    出");
            System.out.println("        请选择(1-5):");

            char menu = CMUtility.readMenuSelection();
            switch(menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
//                    System.out.println("退出");
                    System.out.println("确认是否退出(Y\\N)");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isflag = false;
                    }
//                    break;
            }
        }

    }

    /**
     * 添加客户
     */
    private  void addNewCustomer(){
        System.out.println("----------------------添加客户----------------------");
        System.out.print("姓名:");
        String name = CMUtility.readString(10);
        System.out.print("性别:");
        String gender = CMUtility.readString(2);
        System.out.print("年龄: ");
        int age = CMUtility.readInt();
        System.out.print("电话:");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱:");
        String email = CMUtility.readString(30);

        //将上述数据封装到对象中
        Customer customer = new Customer(name,gender,age,phone,email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess){
            System.out.println("----------------------添加完成----------------------");
        }else{
            System.out.println("客户已满,无法添加");
        }
    }

    /**
     * 修改客户操作
     */
    private void modifyCustomer(){
        System.out.println("----------------------添加完成----------------------");
        Customer cust;
        int number;
        for (; ;){
            System.out.println("请选择待修改的客户编号(-1退出)");
            number = CMUtility.readInt();

            if (number == -1){
                return;
            }

             cust = customerList.getCustomer(number-1);
            if (cust == null){
                System.out.println("无法找到指定客户");
            }else{
                break;
            }
        }
        //修改客户信息
        System.out.print("姓名(" + cust.getName() + "): ");
        String name = CMUtility.readString(10,cust.getName());

        System.out.print("性别(" + cust.getGender() + "): ");
        String gender = CMUtility.readString(2,cust.getGender());

        System.out.print("年龄(" + cust.getAge() + "): ");
        int age = CMUtility.readInt(cust.getAge());

        System.out.print("电话(" + cust.getPhone() + "): ");
        String phone = CMUtility.readString(13,cust.getPhone());

        System.out.print("邮箱(" + cust.getEmail()+ "): ");
        String email = CMUtility.readString(30,cust.getEmail());

        Customer newCust = new Customer(name,gender,age,phone,email);


        boolean isReplaced = customerList.replaceCustomer(number-1,newCust);
        if (isReplaced){
            System.out.println("----------------------修改完成----------------------");
        }else{
            System.out.println("----------------------修改失败----------------------");
        }
    }

    /**
     * 删除客户操作
     */
    private void deleteCustomer(){
        System.out.println("删除客户操作");
        System.out.println("----------------------删除客户----------------------");
        int number;
        for (;;){
            System.out.println("请选择待删除的客户编号(-1退出)");
            number = CMUtility.readInt();
            if (number == -1){
                return;
            }
            Customer customer = customerList.getCustomer(number-1);
            if(customer == null){
                System.out.println("无法找到指定客户!");
            }else{
                break;
            }
        }

        //找到了指定的客户
        System.out.println("是否删除(Y/N)");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y'){
            boolean deleteSuccess = customerList.deleteCustomer(number-1);
            if (deleteSuccess){
                System.out.println("----------------------删除成功----------------------");
            }else{
                System.out.println("----------------------删除失败----------------------");
            }
        }
    }

    /**
     * 显式客户列表
     */
    private void listAllCustomers(){
        System.out.println("----------------------客户列表----------------------");
        if (customerList.getTotal() == 0){
            System.out.println("没有客户记录!");
        }else{

            System.out.println("序号\t\t姓名\t性别\t年龄\t电话\t邮箱");
            Customer [] custs = customerList.getAllCustomers();
            for (int i = 0; i <custs.length ; i++) {
                Customer cust = custs[i];
                System.out.println((i+1) + "\t"+cust.getName() + "\t"+
                                    cust.getGender() +"\t" + cust.getAge()+"\t"+
                                    cust.getPhone() + "\t"+cust.getEmail());

            }
        }





        System.out.println("--------------------客户列表完成--------------------");
    }


    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
