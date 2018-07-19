package knn;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class knn {

	//「歩く」や「走る」のデータごとにサンプルデータのリスト集を作る
	//calcで計算し、距離とラベルの入ったリストを受けとる
	//リストを距離で並び替え、上位k個のラベルを判別
	//動作を判定する


	List<DataClass> list = new ArrayList<DataClass>();
	
	public int ReturnLabel(Queue<Point> queue) {
		ListData listt = new ListData();
		int label = 0;
		for(int i=1; i<10; i+=3) {
			listt.Data(i);
			Sample sample = new Sample(listt.list,label);
			//インターフェースに飛ばす
			Euclid euclid = new Euclid(queue);
			DataClass dc = new DataClass(label,euclid.Calc(sample));
			list.add(dc);
			label++;
		}
		
		int min = 0;
		for(int i=1; i<list.size(); i++) {
			if(list.get(min).getDistance()>list.get(i).getDistance()) min = i;
		}
		
		return min;
	}

}
