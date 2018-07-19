package knn;

import java.util.List;
import java.util.Queue;

import org.opencv.core.Point;

public class Euclid implements Calc {

	double x, y;
	double euclid = 100;
	double ans = 100;
	Queue<Point> queue;
	double eucli;

	/*Euclidクラスのインスタンスを生成したときに、
	 * そのクラス内の変数としてqueueを持つようにコンストラクタに書く
	 */
	public Euclid(Queue<Point> queue) {
		this.queue = queue;
	}

	//実際の計算はここから
	public double Calc(Sample sample) {

		//サンプルデータの取得（できたらインターフェース内にかけると良いかも・・・）
		//ListData listt = new ListData();
		
		List<List<Point>> list = sample.getSampleDatas();
		Queue<Point> copy = queue;

		//実際の計算
		for (int j = 0; j < list.size(); j++) {
			for (int i = 0; i < 20; i += 2) {//listのlistの中身をユークリッドとる
				Point p = copy.remove();
				x = p.x;//入力画像のx
				y = p.y;//入力画像のy
				double lx = list.get(j).get(i).x;
				double ly = list.get(j).get(i).y;
				eucli += (x - lx) * (x - lx) + (y - ly) * (y - ly);//足していく
				if(euclid>eucli) euclid=eucli;
				
				//計算結果をリストに入れる
				//distanceData.add(dc);

			}
			//if(ans>euclid)ans=euclid;//listの中で最も小さい値
		}
		return euclid;
	}

}