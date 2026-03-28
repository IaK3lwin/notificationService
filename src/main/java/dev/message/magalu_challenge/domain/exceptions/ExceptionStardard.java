package dev.message.magalu_challenge.domain.exceptions;

public class ExceptionStardard extends RuntimeException {
  private String path;
  private String message;

  public ExceptionStardard(String message, String path) {
    super("{ \n path: " + path + ", \n message: " + message + "\n }\n");
    this.path = path;
    this.message = message;
  }

  @Override
  public String getMessage() {
    // TODO Auto-generated method stub
    return super.getMessage();
  }
}
