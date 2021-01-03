package net.javaguides.springboot.Exception;

public class UserHasBeenUsedException extends RuntimeException{
		public UserHasBeenUsedException(String message) {
			super(message);
		}
		
		public UserHasBeenUsedException(String message, Throwable cause) {
			super(message, cause);
		}
}
