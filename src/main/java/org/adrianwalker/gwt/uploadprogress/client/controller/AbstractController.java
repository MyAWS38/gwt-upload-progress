package org.adrianwalker.gwt.uploadprogress.client.controller;

import com.google.gwt.core.client.GWT;
import org.adrianwalker.gwt.uploadprogress.client.UploadProgressService;
import org.adrianwalker.gwt.uploadprogress.client.UploadProgressServiceAsync;

public abstract class AbstractController {

  protected static final UploadProgressServiceAsync SERVICE = GWT.create(UploadProgressService.class);
}
