/*******************************************************************************
 * Copyright (c) 2011 Xtreme Labs Inc..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Xtreme Labs Inc. - initial API and implementation
 ******************************************************************************/
package xtremelabs.bbscreenshot;

import net.rim.blackberry.api.menuitem.ApplicationMenuItemRepository;
import net.rim.device.api.system.ApplicationDescriptor;
import net.rim.device.api.system.RuntimeStore;
import net.rim.device.api.ui.ConvenienceKeyUtilities;
import net.rim.device.api.ui.Keypad;
import net.rim.device.api.ui.UiApplication;
import net.rim.device.api.ui.component.Dialog;

/**
 * This class extends the UiApplication class, providing a
 * graphical user interface.
 */
public class ScreenshotApp extends UiApplication
{
	/**
	 * Entry point for application
	 * @param args Command line arguments (not used)
	 */ 

	static RuntimeStore store = RuntimeStore.getRuntimeStore();
	final static long ID = 0x88ca79067d23b28cL;

	public static void main(String[] args)
	{
		Object obj = store.get(ID);
		if (obj == null){
			ApplicationMenuItemRepository repository = ApplicationMenuItemRepository.getInstance();
			ScreenshotMenuItem mi = new ScreenshotMenuItem();
			repository.addMenuItem(ApplicationMenuItemRepository.MENUITEM_SYSTEM, mi);

			try{
				store.put(ID, "xtremestring");
			} catch(IllegalArgumentException e){

			}
			
		}
	}


	/**
	 * Creates a new MyApp object
	 */
	public ScreenshotApp()
	{
	}    
}
