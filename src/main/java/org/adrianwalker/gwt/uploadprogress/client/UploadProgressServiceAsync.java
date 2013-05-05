package org.adrianwalker.gwt.uploadprogress.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import org.adrianwalker.gwt.uploadprogress.common.dto.FileDto;
import org.adrianwalker.gwt.uploadprogress.common.event.Event;

public interface UploadProgressServiceAsync {

  void initialise(AsyncCallback<Void> asyncCallback);

  void countFiles(AsyncCallback<Integer> asyncCallback);

  void readFiles(int page, int pageSize, AsyncCallback<List<FileDto>> asyncCallback);

  void getEvents(AsyncCallback<List<Event>> asyncCallback);
}
