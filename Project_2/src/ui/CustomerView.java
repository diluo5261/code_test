package ui;

import bean.Customer;
import service.CustomerList;
import util.CMUtility;

public class CustomerView {
    private CustomerList customerList = new CustomerList(10);


    public CustomerView(){
        Customer customer = new Customer("张三",'男',56,"15623151236","45464@qq.com");
        customerList.addCustomer(customer);
    }

    public void enterMainMenu(){
        boolean isFlag = true;
        while (isFlag){
            System.out.println("*****************客户信息管理软件*****************");
            System.out.println("                 1、添加客户");
            System.out.println("                 2、修改客户");
            System.out.println("                 3、删除客户");
            System.out.println("                 4、客户列表");
            System.out.println("                 5、退    出");
            System.out.print("请选择：>  ");
            char menu = CMUtility.readMenuSelection();

            switch(menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2' :
                    modifyCustomer();
                    break;
                case '3' :
                    deleCustomer();
                    break;
                case '4' :
                    listAllCustomer();
                    break;
                case '5' :
                    System.out.println("退出！");
                    System.out.println("确认是否退出（Y/N）:");
                    char exit = CMUtility.readConfirmSelection();
                    if (exit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }

    }

    private void addNewCustomer(){
        System.out.println("添加客户操作！");
        System.out.println("----------添加客户----------");
        System.out.println("姓名：");
        String name = CMUtility.readString(10);
        System.out.println("性别： ");
        char gender = CMUtility.readChar();
        System.out.println("年龄： ");
        int age = CMUtility.readInt();
        System.out.println("电话： ");
        String phone = CMUtility.readString(13);
        System.out.println("邮箱： ");
        String email = CMUtility.readString(30);

        Customer customer = new Customer(name,gender,age,phone,email);

        if (customerList.addCustomer(customer)){
            System.out.println("添加完成！");
        }else{
            System.out.println("客户目录已满，无法添加！");
        }
    }

    private void modifyCustomer(){
        System.out.println("修改客户操作！");
        System.out.println("----------修改客户----------");
        Customer cust;
        int number;
        while(true){
            System.out.println("请选择修改客户编号（-1退出）");
            number = CMUtility.readInt();

            if (number == -1){
                return;
            }

            cust = customerList.getCustomer(number-1);
            if (cust == null){
                System.out.println("无法找到指定的客户！");
            }else{
                break;
            }
        }

            System.out.println("姓名：");
            String name = CMUtility.readString(10);
            System.out.println("性别： ");
            char gender = CMUtility.readChar();
            System.out.println("年龄： ");
            int age = CMUtility.readInt();
            System.out.println("电话： ");
            String phone = CMUtility.readString(13);
            System.out.println("邮箱： ");
            String email = CMUtility.readString(30);
            Customer customer = new Customer(name,gender,age,phone,email);

            boolean isReplace = customerList.replaceCustomer(number,customer);
            if (isReplace) {
                System.out.println("修改成功");
            }else{
                System.out.println("修改失败");
            }

    }

    private void deleCustomer(){
        System.out.println("删除客户操作");
        System.out.println("----------显式客户----------");
        int number;
        while(true){
            System.out.println("请选择删除客户编号：");
            number = CMUtility.readInt();
            if (number == -1){
                return;
            }
            Customer customer = customerList.getCustomer(number);
            if (customer == null){
                System.out.println("无法找到指定客户");
            }else{
                break;
            }
        }

        System.out.println("确认是否删除（Y/N）：");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y'){
            boolean deleteSuccessful = customerList.deleteCustomer(number-1);
            if (deleteSuccessful){
                System.out.println("删除成功！");
            }else{
                System.out.println("删除失败！");
            }
        }else{
            return;
        }

    }




    private void listAllCustomer(){
        System.out.println("显式客户列表操作");
        System.out.println("----------显式客户----------");

        int total = customerList.getTotal();
        if (total == 0){
            System.out.println("没有客户记录：");
        }else{
            Customer[] custs = customerList.getAllCustomers();
            System.out.println("姓名  性别 年龄 电话 邮箱 ");
            for (int i = 0; i <custs.length ; i++) {
                Customer cust = custs[i];
                System.out.println((i+1)+"\t"+cust.getAge()+" "+ cust.getGender()
                +" "+ cust.getAge()+ " "+ cust.getPhone() + " "+ cust.getEmail());

            }
            System.out.println("客户列表完成");

        }
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();

    }




}
