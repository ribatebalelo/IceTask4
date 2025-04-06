/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
