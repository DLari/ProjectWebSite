package ru.reksoft.interns.projectwebstore.HttpExeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IdNotFoundException extends RuntimeException{}