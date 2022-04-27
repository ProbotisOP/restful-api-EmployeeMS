package com.example.Exceptions;



import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class MainExceptionHandler  extends ResponseEntityExceptionHandler{

		@ExceptionHandler(FieldRequiredException.class)
		public ResponseEntity<Object> fieldRequiredHandler (FieldRequiredException ex){
			
			String msg = "Input Fields cant be empty";
			
			return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
		}
		
		@ExceptionHandler(NoSuchElementException.class)
		public ResponseEntity<Object> NoSuchElementException (NoSuchElementException ex){
			
			String msg = "No Employee Found with this ID";
			return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
	     }
		
		
		@ExceptionHandler(EmployeeAlredyPresent.class)
		public ResponseEntity<Object> alredyPresent(EmployeeAlredyPresent ex){

			String msg = "Employee Alredy present with this ID";
			
			return new ResponseEntity<>(msg,HttpStatus.BAD_REQUEST);
		}

}
