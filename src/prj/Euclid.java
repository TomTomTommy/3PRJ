	package prj;
	
	import java.awt.Point;
import java.util.ArrayDeque;
import java.util.ArrayList;
	import java.util.List;
import java.util.Queue;

import org.opencv.core.Mat;
	
	public class Euclid {
		double x,y;
		double euclid=100;
		double ans=100;
		public List<Double>data= new ArrayList<Double>(); 
		public Euclid(Queue<Point> queue) {
			ListData listt=new ListData();
			List<List> list = listt.list;
			Queue<Point> copy=queue;
			for(int j=0;j<list.size();j++) {
			  for(int i=0;i<20;i+=2) {//listのlistの中身をユークリッドとる
				  Point p=copy.remove();
					x=p.getX();//入力画像のx
					y=p.getY();//入力画像のy
			String objStr1 =list.get(0).get(i).toString();
			String objStr2 =list.get(0).get(i+1).toString();
			double lx=new Double(objStr1).doubleValue();
			double ly=new Double(objStr2).doubleValue();
			euclid+=(x-lx)*(x-lx)+(y-ly)*(y-ly);//足していく
			data.add(euclid);
			//if(euclid>eucli)euclid=eucli;//最小の値を求める
			   }
			//if(ans>euclid)ans=euclid;//listの中で最も小さい値
			}
		}
	
	}
