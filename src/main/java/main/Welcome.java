package main;

/**
 * Created by fanjj on 2018/12/3
 */
public class Welcome {
    public void sayHello(){
        System.out.println("sayHello");
    }

    public static void main(String[] args){
        Welcome welcome = new Welcome();
        welcome.sayHello();
    }
}
