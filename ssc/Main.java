package ssc;
//import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static final char Njump = 'ε';
    public static void main(String[] args) {
    	/**
    	 * 初始化文法
    	 */
        String S="E";//开始符
        String P[]={"E->aA|bBC","C->"+Njump,"A->cA|d","B->cB|d"};//规则集
        
        /**
         * new一个Grammar对象
         */
        Grammar G=new Grammar(P,S);
        G.out();//调用G.out()方法
        
        
        /**
         * 开辟一个输入，从控制台读入字符串，并及时关闭
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串:");
        String text = sc.next(); 
        sc.close();
        
        /**
         * 输入测试数据bccd
         */
        
        try {
        	if(G.contains(text)) {
        		System.setOut(System.out);
        		System.out.print("输入串已经被识别，输入正确。语法树已经输出到："+"C:/Users/18567731037/Desktop/OutPut.txt");
        	} 
        	else {
            	System.out.print(G.contains(text));
        	}

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
}
