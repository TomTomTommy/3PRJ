package prj;

import java.util.ArrayList;
import java.util.List;

public class ListData {
	int m_label;
	List<List> list = new ArrayList<>();//リストのリスト
	public ListData() {
		for(int i=1;i<3;i++) {
			String text="data"+i;
		ReadText data=new ReadText(text);//data i をリストに追加
		list.add(data.list);//data.listはただのintのlist
		//System.out.println(list.get(i));
		}
	}
}
