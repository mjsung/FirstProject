//replace, replaceAll => &lt;< &gt;>
public class ���ڿ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="&lt;html&gt;";
		data=data.replaceAll("&lt;", "<");
		data=data.replaceAll("&gt;", ">");
		System.out.println(data);
		data="Hello\tHello\tHello\t";
				System.out.println(data.replace('\t', '\n'));
	
	}

}
