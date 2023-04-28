package util;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;

public class UtilityMethods {

	public static void log(Bundle bundle, String s) {
		log(new Status(IStatus.INFO, bundle.getSymbolicName(), IStatus.OK, s, null), bundle);
	}

	public static void log(Bundle bundle, Throwable e) {
		log(new Status(IStatus.ERROR, bundle.getSymbolicName(), IStatus.ERROR, "Error", e), bundle);
	}

	public static void log(IStatus status, Bundle bundle) {
		final ILog LOGGER = Platform.getLog(bundle);
		LOGGER.log(status);
	}

}
