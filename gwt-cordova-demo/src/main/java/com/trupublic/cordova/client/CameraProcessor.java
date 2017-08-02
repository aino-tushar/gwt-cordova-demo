package com.trupublic.cordova.client;

import com.florianf.gwtcordova.client.plugin.camera.Camera;
import com.florianf.gwtcordova.client.plugin.camera.CameraConstants;
import com.florianf.gwtcordova.client.plugin.camera.CameraOptions;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;

/**
 * @author tushar@ainosoft.com
 * @CreatedOn 02-Aug-2017
 * @Responsibility
 */
public class CameraProcessor {

	@UiField
	Button			cameraButton;

	@UiField
	ImageElement	image;

	@UiField
	SpanElement		text;

	public void openCamera() {
		CameraOptions cameraOptions = new CameraOptions();
		cameraOptions.setDestinationType(CameraConstants.DestinationType.FILE_URI);
		Camera.getPicture(s -> {
			text.setInnerText("success");
			image.setSrc(s);
			image.setAttribute("style", "max-width: 50%; max-height: 50%");

			return null;

		}, s -> {
			text.setInnerText("error: " + s);
			return null;
		}, cameraOptions);
	}
}
