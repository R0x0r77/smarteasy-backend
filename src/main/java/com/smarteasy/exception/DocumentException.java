package com.smarteasy.exception;

public class DocumentException extends Exception {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  public DocumentException() {
    super();
  }

  public DocumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public DocumentException(String message, Throwable cause) {
    super(message, cause);
  }

  public DocumentException(String message) {
    super(message);
  }

  public DocumentException(Throwable cause) {
    super(cause);
  }

}
