import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class ��Ÿ���ڿ�_��ȭ��ŷ�������� {

	public static void main(String[] args)
	throws Exception
	{
		// TODO Auto-generated method stub
		Document doc=Jsoup.connect("http://movie.naver.com/movie/sdb/rank/rmovie.nhn").get();
		//System.out.println(doc);
		/*
		 * <td class="title">
						<div class="tit3">
							<a href="/movie/bi/mi/basic.nhn?code=143245" title="�ȷ�: ���ɽź�">�ȷ�: ���ɽź�</a>
						</div>
					</td>

		 */
		Elements data=doc.select("td.title div.tit3");
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).text());
		}
	}

}
