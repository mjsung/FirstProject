package com.sist;
import java.util.*;
public class MainClass {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vector<String> vec=
        		new Vector<String>(5);
        // Vector : List (������ ����,�ߺ��� ���)
        // �߰� ==> 0
        //System.out.println(vec.capacity());
        vec.addElement("ȫ�浿");// 0
        vec.addElement("��û��");//2
        vec.addElement("��û��");
        vec.addElement("��û��");
        vec.addElement("��û��");
        vec.addElement("��û��");
        vec.addElement("��û��");
        vec.addElement("��û��");
        vec.addElement("��û��");
        vec.addElement("��û��");
        vec.addElement("��û��");
        
        vec.addElement("��û��");
        System.out.println(vec.capacity());
        vec.add(1, "������");// 1 ==> gc
        for(int i=0;i<vec.size();i++)
        {
        	String name=vec.elementAt(i);
        	//  vec.get(i)
        	System.out.println(name);
        }
        // for-each : �迭,�÷���
        vec.set(1, "�̼���");
        vec.removeElementAt(0);// ȫ�浿 ����
        // �̼��� => ��û�� 
        System.out.println("���� ����:"+vec.size());
       // vec.removeAllElements();
        vec.clear();
        System.out.println("���� ����:"+vec.size());
        // ��ü ���� 
        for(String name:vec)
        {
        	System.out.println(name);
        }
	}

}
