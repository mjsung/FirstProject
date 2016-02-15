package com.sist;
/*
 * 	java.util
 *    =========
 *    = Date : �ý����� �ð��� �о� �´� (�����ͺ��̽�)
 *       => SYSDATE 
 *    = Calendar 
 *    = StringTokenizer , split
 *      ������ , ��Ʈ��ũ = ���ڿ��� ��� ������  OutputStream
 *                     class�� ��� ������ ObjectOutputStream
 *                       ===> ����ȭ 
 */
import java.util.*; //Date
import java.text.*; // SimpleDateFormat
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		System.out.println(date.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� M�� d�� (h:mm:ss)");
		/*
		 * yyyy: �⵵ (yy,yyy)
		 * MM : �� (M) => 01 => 12 (����� �ƴ϶� ������ ����ų� �Ҷ��� 01, 02���� �ƴ϶� 1,2,3 M���� �ؾ� 8���� ������ �ȳ�)
		 * dd : ��(d)
		 * 
		 * hh : �ð�(hour)
		 * mm : ��
		 * ss : ��
		 */
		System.out.println(sdf.format(date));
	}

}
