/*
 * generated by Xtext 2.22.0
 */
package org.xtuml.canvas.language.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Constants;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class CanvasUiModule extends AbstractCanvasUiModule {

	private static AbstractUIPlugin modulePlugin;

	public CanvasUiModule(AbstractUIPlugin plugin) {
		super(plugin);
		modulePlugin = plugin;
	}
	
	public static void logError(String message, Throwable e) {
			Status status = new Status(IStatus.ERROR, (String) modulePlugin.getBundle().getHeaders().get(Constants.BUNDLE_NAME),
					IStatus.ERROR, message, e);
			modulePlugin.getLog().log(status);
	}
	
	
}