package prj;

public class LabelName {

	public String Name(int label) {
		String[] name = {"歩く", "座る", "立つ"};
		for(int i=0; i<3; i++) {
			if(label==i) return name[i];
		}
		return "error";
	}
}