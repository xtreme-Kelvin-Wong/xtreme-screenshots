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

import net.rim.blackberry.api.menuitem.ApplicationMenuItem;
import net.rim.device.api.ui.UiApplication;
import xtremelabs.bbscreenshot.controllers.TakeScreenshot;

public class ScreenshotMenuItem extends ApplicationMenuItem {	
	public ScreenshotMenuItem(){
		super(1);
	}

	public Object run(Object context) {
		UiApplication.getApplication().invokeLater(new Runnable() {
			public void run() {
				new TakeScreenshot();
			}
		}, 100, false);
		return null;
	}

	public String toString() {
		return "Take Screenshot";
	}

}
