package com.sist;

import org.rosuda.REngine.REXP;
import org.rosuda.REngine.Rserve.RConnection;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			RConnection rc=new RConnection();
			rc.voidEval("emp<-read.csv(\"c:/image/emp.csv\",header=T,sep=\",\")");
			rc.voidEval("png(\"c:/image/emp.png\")");
			rc.voidEval("pie(emp$sal,labels=emp$ename)");
			rc.voidEval("dev.off()");
			System.out.println("¿Ï·á");
			/*org.rosuda.REngine.REXP p=rc.eval("emp$ename");
			String[] str=p.asStrings();
			for(String s:str)
			{
				System.out.println(s);
			}*/
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
