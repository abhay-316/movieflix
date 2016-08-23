package io.egen2.springrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class TitleNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 405802649322364762L;

	public TitleNotFoundException(String message) {
		super(message);
	}

	public TitleNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
