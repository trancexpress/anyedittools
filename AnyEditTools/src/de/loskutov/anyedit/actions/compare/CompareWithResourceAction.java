/*******************************************************************************
 * Copyright (c) 2009 Andrey Loskutov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributor:  Andrey Loskutov - initial API and implementation
 *******************************************************************************/
package de.loskutov.anyedit.actions.compare;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

import de.loskutov.anyedit.compare.ContentWrapper;
import de.loskutov.anyedit.compare.StreamContent;
import de.loskutov.anyedit.util.EclipseUtils;

/**
 * @author Andrey
 */
public class CompareWithResourceAction extends CompareWithAction {

    public CompareWithResourceAction() {
        super();
    }

    @Override
    protected StreamContent createRightContent(StreamContent left) throws CoreException {
        IFile file = EclipseUtils.getWorkspaceFile();
        if (file == null) {
            return null;
        }
        return createContentFromFile(ContentWrapper.create(file));
    }

}
