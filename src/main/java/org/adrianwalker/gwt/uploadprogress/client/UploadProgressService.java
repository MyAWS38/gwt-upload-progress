package org.adrianwalker.gwt.uploadprogress.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import org.adrianwalker.gwt.uploadprogress.common.dto.FileDto;
import org.adrianwalker.gwt.uploadprogress.common.event.Event;

@RemoteServiceRelativePath("uploadprogress")
public interface UploadProgressService extends RemoteService {

  void initialise();

  int countFiles();

  List<FileDto> readFiles(int page, int pageSize);

  List<Event> getEvents();
}
