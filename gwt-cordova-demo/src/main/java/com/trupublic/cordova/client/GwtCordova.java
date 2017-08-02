package com.trupublic.cordova.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtCordova implements EntryPoint {

	private CameraProcessor	cameraProcessor	= new CameraProcessor();

	public void onModuleLoad() {
		Button btn = new Button("Open camera");
		btn.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

			}
		});
	}
}
