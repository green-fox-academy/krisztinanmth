public class Shifter implements CharSequence {
  String str;
  int a;

  public Shifter(String str, int a) {
    this.str = str;
    this.a = a;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return str.charAt(index + a);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
