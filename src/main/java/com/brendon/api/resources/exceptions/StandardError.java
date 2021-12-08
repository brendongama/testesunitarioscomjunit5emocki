package com.brendon.api.resources.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StandardError {

	private LocalDateTime timestamp;
	private Integer status;
	private String error;
	private String path;
}
