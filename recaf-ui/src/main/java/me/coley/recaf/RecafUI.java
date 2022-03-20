package me.coley.recaf;

import me.coley.recaf.ui.Windows;

/**
 * Singleton references to core UI components.
 *
 * @author Matt Coley
 */
public class RecafUI {
	private static boolean initialized;
	private static Windows windows;
	private static Controller controller;

	/**
	 * @return Window manager.
	 */
	public static Windows getWindows() {
		return windows;
	}

	/**
	 * @return Controller instance.
	 */
	public static Controller getController() {
		return controller;
	}

	/**
	 * Setup UI components.
	 *
	 * @param controller
	 * 		Controller instance.
	 */
	public static void initialize(Controller controller) {
		if (!initialized) {
			RecafUI.controller = controller;
			windows = new Windows();
			windows.initialize();
			initialized = true;
		}
	}
}
