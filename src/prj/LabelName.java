package prj;

public class LabelName {

	public String Name(int label) {
		String[] name = {"walk", "sit", "stand","stop"};
		for(int i=0; i<4; i++) {
			if(label==i) return name[i];
		}
		return "error";
	}
}