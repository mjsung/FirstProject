package com.sist;
import java.util.*;
import java.io.*;
public class MainClass {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
        EmpDAO dao=new EmpDAO();
        ArrayList<EmpDTO> list=dao.empAllData();
        File file=new File("c:\\image\\emp.csv");
        if(!file.exists())
        {
        	file.createNewFile();
        }
        FileWriter fw=new FileWriter(file);
        String data="empno,ename,sal\n";
        for(EmpDTO d:list)
        {
        	data+=d.getEmpno()+","
                 +d.getEname()+","
                 +d.getSal()+"\n";
        }
        fw.write(data);
        fw.close();
        System.out.println("¿Ï·á");
	}

}
