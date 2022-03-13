import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrSuffle {
  public static void main(String[] args) {
    String[] alphabets = { "abc","efg","hij","k","lmn","opq" };

    List<String> list = Arrays.asList(alphabets);

    Collections.shuffle(list);

    for (String alpha : list) {
      System.out.print(alpha + " ");
    }
  }
}