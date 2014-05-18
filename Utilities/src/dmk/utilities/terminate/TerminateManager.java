package dmk.utilities.terminate;

import java.util.ArrayList;

public class TerminateManager extends Thread {

	private static TerminateManager terminateManager = new TerminateManager();
	
	private ArrayList<Terminate> ltTerminate = new ArrayList<Terminate>();
	private boolean isTerminate = false;
	
	private TerminateManager() {
		Runtime.getRuntime().addShutdownHook(this);
	}
	
	public static TerminateManager getInstance() {
		return terminateManager;
	}
	
	public void regist(Terminate terminate) {
		if (!isTerminate)
			ltTerminate.add(terminate);
	}
	
	public void run() {
		isTerminate = true;
		
		for (Terminate terminate : ltTerminate)
			terminate.terminate();
	}
	
}
