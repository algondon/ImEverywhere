package com.ylj.test_java1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test1 {
	public static void main(String[] args) {
		
		//////////////////��Х��
//	PythonInterpreter interpreter = new PythonInterpreter();  
//    interpreter.execfile("client.py");  
//    PyFunction func = (PyFunction)interpreter.get("test",PyFunction.class);  
//  
//        String question = "ʲô�����˻�"
//    String username	= "Human"	
//    PyObject pyobj = func.__call__(new PyInteger(question), new PyInteger(username));  
//    System.out.println("anwser = " + pyobj.toString());  
        
        
        /////////////////////�ڶ���
        try{  
            System.out.println("==========start");
            String question = "��������Ч��";
            //Process pr = Runtime.getRuntime().exec("python F:/Eclipse_workspace/Test_java1/lib/client.py " + question);  
            Process pr = Runtime.getRuntime().exec("python ./lib/client.py " + question);  
              
            BufferedReader in = new BufferedReader(new  
                    InputStreamReader(pr.getInputStream()));  
            String line;  
            while ((line = in.readLine()) != null) {  
                System.out.println(line);  
            }  
            in.close();  
            pr.waitFor();  
            System.out.println("===========end");  
    } catch (Exception e){  
                e.printStackTrace();  
            }  
    }  
}
