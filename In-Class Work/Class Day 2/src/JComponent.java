
public class JComponent {

	public static void main(String[] args) {
		

	}
	MouseMotionListener[] mouseMotionListeners = new MouseMotionListener[1000];
	int cMMLs = 0;
	
	void addMouseMotionListener(MouseMotionListener x) {
		mouseMotionListeners[cMMLs] = x;
		cMMLs++;
	}
	
	}
}
