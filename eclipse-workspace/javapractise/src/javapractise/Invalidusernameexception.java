package javapractise;

public class Invalidusernameexception {
	

			    // A custom exception class
			    public static class InvalidUserException extends Exception {

			        public InvalidUserException() {
			            super("Invalid username / password provided");
			        }

			    }

			    public static void main(String[] args) {

			       
			        String username = "username";

			        String password = "pass";

			        try {

			            if (username.equals("user") && password.equals("pass")) {

			                System.out.println("Login Succesfull");

			            } else {

			                throw new InvalidUserException();
			            }

			        } catch (InvalidUserException e) {
			            System.out.println(e);
			        }
			    }
			}

