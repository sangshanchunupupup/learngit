/**
 * 
 */
package ssc;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;


public class OutPut {
	
	public static void printToFile( ArrayList<String> list) {
		try {
			PrintStream out = System.out;
            PrintStream print=new PrintStream("C:\\Users\\18567731037\\Desktop\\OutPut.txt");  //输出位置文件；
            System.setOut(print); //将输出流定向到文件
            System.out.println("语法树如下：");//逆序输出我的符号栈，即冗余的语法树
        	for (int j = list.size() - 1; j >= 0; j--) {
        		String temp = list.get(j);
        	
        		temp=temp.substring(3,temp.length()-1);
        	    System.out.println(temp);
        	}
        	System.setOut(out); //将输出重新定向到控制台
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        }  
	}   
}
