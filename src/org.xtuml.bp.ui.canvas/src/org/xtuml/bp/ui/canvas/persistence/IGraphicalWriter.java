package org.xtuml.bp.ui.canvas.persistence;

import org.xtuml.bp.core.common.NonRootModelElement;

public interface IGraphicalWriter {
	void initialize();
	void write(NonRootModelElement model);
	void write(NonRootModelElement model, boolean generate);
	void nameChange(NonRootModelElement modelElement, Object oldValue);
}
