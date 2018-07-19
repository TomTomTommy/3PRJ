package knn;

import java.io.Serializable;

/**
 * @author g16954yh
 * ラベルと距離を扱うクラス
 */
public class DataClass implements Serializable {

	public int label;
	public double distance;

	public DataClass(int label, double distance) {
		this.label = label;
		this.distance = distance;
	}

	public int getLabel() {
		return label;
	}

	public double getDistance() {
		return distance;
	}

}