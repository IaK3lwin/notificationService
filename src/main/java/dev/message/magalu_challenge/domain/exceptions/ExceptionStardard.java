package dev.message.magalu_challenge.domain.exceptions;


public class ExceptionStardard extends RuntimeException {
  private String path;
  private String message;
  private final short code;

  public ExceptionStardard(String message, String path, short code) {
    super("{ \n path: " + path + ", \n message: " + message + ", \n code: " + code  + "\n }\n");
    this.path = path;
    this.message = message;
    this.code = code;
  }

  @Override
  public String getMessage() {
    // TODO Auto-generated method stub
    return super.getMessage();
  }


  public short getCode() {
    return code;
  }
}
