package dmk.utilities.pid;

import java.lang.management.ManagementFactory;
import java.util.StringTokenizer;

public class ProcessID {

public static String get() {
		
		String runtimeName = ManagementFactory.getRuntimeMXBean().getName(); 
		StringTokenizer st = new StringTokenizer(runtimeName, "@");
		String pid = st.nextToken();
		
		return pid;
	}

}
