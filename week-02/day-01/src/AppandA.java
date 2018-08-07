// - Create an array variable named `animals`
//   with the following content: `["koal", "pand", "zebr"]`
// - Add all elements an `"a"` at the end

public class AppandA {
  public static void main(String[] args) {

    String[] animals = {"koal", "pand", "zebr"};

    for (int ani = 0; ani < animals.length; ani++) {
      animals[ani] = animals[ani] + "a";
    }

    for (int p = 0; p < animals.length; p++) {
      System.out.println(animals[p]);
    }
  }
}
