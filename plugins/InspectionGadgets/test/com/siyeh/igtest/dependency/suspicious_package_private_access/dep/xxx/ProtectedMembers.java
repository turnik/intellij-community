package xxx;

public class ProtectedMembers {
  protected String field;

  protected String method() {
    return null;
  }

  static protected void staticMethod() {
  }

  protected static class StaticInner {
    protected void protectedMethod() {
    }
  }
}