package dmk.utilities.pool;

public abstract class CommonPool {

	private int maxPoolSize = 0;
	
	public int getMaxPoolSize() {
		return this.maxPoolSize;
	}
	
	public void setMaxPoolSize(int maxPoolSize) {
		this.maxPoolSize = maxPoolSize;
	}
	
	public abstract void idleCheck();
}
