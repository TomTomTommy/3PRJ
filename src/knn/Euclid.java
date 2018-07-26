package knn;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import org.opencv.core.Point;

public class Euclid implements Calc {

	double x, y;
	double euclid=0;
	Queue<Point>queue;
	List<Point>copy;
	List<Double>ListResult=new ArrayList<Double>();

	/*Euclidクラスのインスタンスを生成したときに、
	 * そのクラス内の変数としてqueueを持つようにコンストラクタに書く
	 */
	public Euclid(Queue<Point> queue) {
		this.queue = queue;
	}

	//実際の計算はここから
	public labelDouble Calc(Sample sample) {
		System.out.println("samplesize"+sample.SampleDatas.size());
		//サンプルデータの取得（できたらインターフェース内にかけると良いかも・・・）
		//ListData listt = new ListData();
		List<List<Point>> list = new ArrayList<List<Point>>();
		list=sample.getSampleDatas();//etc 歩くが入ったリスト
		copy=new ArrayList<Point>();
		for(int i=0;i<10;i++) {//キューのコピーをリストに入れた
			copy.add(queue.poll());
			}
         for(int i=0;i<copy.size();i++) {
        	queue.add(copy.get(i)) ;
         }
		//実際の計算
		for (int j = 0; j < list.size(); j++) {//入力のqueueをリストに入れたい
			for (int i = 0; i < 10; i ++) {//10行と仮定
				Point p = copy.get(i);//入力画像のi番目
				//Point p = queue.poll();
				x = p.x;//入力画像のx
				y = p.y;//入力画像のy
				double lx = list.get(j).get(i).x;//サンプルのx
				double ly = list.get(j).get(i).y;//サンプルのy
				//System.out.println("x"+list.get(j).get(i).x);
				//System.out.println("y"+list.get(j).get(i).y);
				euclid += (x - lx) * (x - lx) + (y - ly) * (y - ly);
				ListResult.add(euclid);
				//if(j==0) euclid = eucli;
				//if(euclid>eucli) euclid=eucli;
				
				//計算結果をリストに入れる
				//distanceData.add(dc);
			}
		}
		labelDouble lD=new labelDouble(ListResult,sample.getLabel());
		return lD;
	}
}