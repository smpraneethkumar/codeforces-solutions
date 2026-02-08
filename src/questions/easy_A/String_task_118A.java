package questions.easy_A;

    import com.sun.source.tree.Tree;
    import com.sun.source.tree.TreeVisitor;

    import java.util.*;
public class String_task_118A {



        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String input = scan.next().toLowerCase();

            int n = input.length();

            String output = "";
            for (int i = 0; i < n; i++) {

                char c = input.charAt(i);
//                output += '.';
                if (c != 'a' && c != 'o' && c != 'y' &&c != 'e' && c != 'u' && c != 'i') {

                    output +="." + c;

                }

            }
                System.out.println(output);


        }
}
