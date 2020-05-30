package net.javabase;

/**
 * @author Yangfengfan
 * @DATE 2020/05/20
 */
public class TransferProperty {
    static int i = 47;          //定义成员变量

    public void call() {                      //定义成员方法
        System.out.println("调用call（）方法");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            if (i == 2) {
                System.out.println("\n");
            }
        }
    }

    public TransferProperty() {
    }

    public static void main(String[] args) {
     TransferProperty t1 = new TransferProperty();
     TransferProperty t2 = new TransferProperty();
     t2.i = 60;
     System.out.println("第一个实例对象调用变量i的结果："+t1.i++);
     t1.call();
     System.out.println("第二个实例对象调用变量i的结果："+t2.i);
     t2.call();
    }
}
