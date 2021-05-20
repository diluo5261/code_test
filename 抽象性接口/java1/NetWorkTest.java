package day15.java1;

import javax.print.attribute.standard.Severity;

public class NetWorkTest {
    public static void main(String[] args) {
        Server s1 = new Server();
        s1.browse();

        ProxyServer p1 = new ProxyServer(s1);
        p1.browse();
    }


}

interface NetWork{
     public void browse();
}

class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实服务器");
    }
}

class ProxyServer implements NetWork{

    private NetWork work;

    public ProxyServer(NetWork work) {
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查！");
    }

    @Override
    public void browse() {
        check();
        work.browse();

    }
}

/*public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        server.browse();

        proxyServe pserver = new proxyServe(server);
        pserver.browse();
    }


}


interface NetWork{
    public void browse();
}

//被代理类
class Server implements NetWork{

    @Override
    public void browse() {
        System.out.println("真实的网络服务器访问网络");
    }
}

//代理类
class proxyServe implements NetWork{
    private NetWork work;

    public proxyServe(NetWork work) {
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
        work.browse();

    }
}*/






