public class ToDoPrint {
  public static void main(String... args){
    String todoText1 = " - buy milk\n";
    String todoText0 = "my toDos: \n";
    String todoText2 = " - download games\n   - diablo";
    // Add "My todo:" to the beginning of the todoText
    // Add " - Download games" to the end of the todoText
    // Add " - Diablo" to the end of the todoText but with indention
    // Expected output:
    // My todo:
    //  - Buy milk
    //  - Download games
    //      - Diablo
    System.out.println(todoText0);
    todoText0 = todoText0.concat(todoText1);
    System.out.println(todoText0);
    todoText0 = todoText0.concat(todoText2);
    System.out.println(todoText0);
  }
}