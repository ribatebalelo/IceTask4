
package convertarraylisttoarray;
import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Physics");
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("Probability");

        // Convert to array
        String[] subjectArray = new String[subjects.size()];
        subjectArray = subjects.toArray(subjectArray);

        // Print array
        for (String subject : subjectArray) {
            System.out.println(subject);
        }
    }
}
