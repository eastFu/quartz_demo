package cn.gyyx.action;

import org.springframework.context.ApplicationContext;

public abstract class AbstractAction {
	
	public abstract void install();
	
	public abstract void unInstall();
	
	public ApplicationContext ctx;
	
}
