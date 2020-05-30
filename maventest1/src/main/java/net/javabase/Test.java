package net.javabase;

/**
 * @author Yangfengfan
 * @DATE 2020/05/21
 */
public class Test {
    public Test(){
        //something
    }
    protected void doSomething(){           //成员方法
        //something
    }
    protected Test doIt(){
        return new Test();
    }
}
class Test2 extends Test{                 //继承父类
    public Test2(){                         //构造方法
        super();                           //调用父类构造方法
        super.doSomething();                 //调用父类的成员方法
    }
    public static void doSomethingnew(){         //新增方法
        //cascsac
    }
    public void doSomething(){                   //重写父方法
        System.out.println("cahsc");
    }
    protected Test2 doIt(){               //重写父类方法，方法的返回值类型为Test2类型
        return new Test2();
    }

}