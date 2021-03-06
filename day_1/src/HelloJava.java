class Book {        //定义一个类
    String title;   //书名
    double price;   //书的价格
    public void getInfo(){  //此方法将由对象调用
        System.out.println("图书名称：" + title + "，价格：" +price);
    }
}

public class HelloJava {
    public static void main(String[] args) {
        Book bk = null;             //声明
        bk = new Book();            //并实例化对象
        bk.title = "Java开发";    //操作属性内容
        bk.price = 89.9;
        bk.getInfo();

        Book bookA = new Book();
        Book bookB = null;
        bookA.title = "Java";
        bookA.price = 89.8;
        bookB = bookA;      //引用传递
        bookB.price = 79.8;
        bookA.getInfo();
        bookB.getInfo();
    }
}
