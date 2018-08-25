public class ThirdAndCompareLength {
  public static void main(String[] args) {
    // - Create an array variable named `q`
    //   with the following content: `[4, 5, 6, 7]`
    // - Print the third element of `q`
    int[] q = {4, 5, 6, 7};
    System.out.println(q[2]);

    // - Create an array variable named `p1`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `p2`
    //   with the following content: `[4, 5]`
    // - Print if `p2` has more elements than `p1`
    int[] p1 = {1, 2, 3};
    int[] p2 = {4, 5};
    System.out.println(moreElements(p1, p2));

  }
  public static boolean moreElements(int[] a, int[] b) {
    return (a.length < b.length);
  }
}
