package knn;

import java.util.ArrayList;
import java.util.List;

import org.opencv.core.Point;

public class labelResult {
	double result; //dataiのj番目の値
	int label;  //ラベル
	
	public labelResult(double result, int label) {
		this.label = label;
		this.result = result;
	}
	
	public int getLabel() {
		return label;
	}
	
	public double getResult(){
		return result;
	}
}