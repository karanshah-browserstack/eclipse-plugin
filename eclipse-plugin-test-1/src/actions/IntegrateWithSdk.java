package com.browserstack.actions;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.osgi.service.datalocation.Location;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.slf4j.LoggerFactory;

import util.*;

public class IntegrateWithSdk extends AbstractHandler {
	private static final Bundle BUNDLE = FrameworkUtil.getBundle(IntegrateWithSdk.class);

	public Object execute(ExecutionEvent event) throws ExecutionException {
		UtilityMethods.log(BUNDLE, "Initiating Integration Wizard....");
		return null;
	}

}