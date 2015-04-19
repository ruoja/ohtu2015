package ohtu;

import java.util.ArrayList;
import java.util.List;

public class Submission {

    private String student_number;
    private int week;
    private int hours;
    private boolean a1;
    private boolean a2;
    private boolean a3;
    private boolean a4;
    private boolean a5;
    private boolean a6;
    private boolean a7;
    private boolean a8;
    private boolean a9;
    private boolean a10;
    private boolean a11;
    private boolean a12;
    private boolean a13;
    private boolean a14;
    private boolean a15;
    private boolean a16;
    private boolean a17;
    private boolean a18;
    private boolean a19;
    private boolean a20;
    private boolean a21;

    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    private List done() {
        boolean[] all = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21};
        List done = new ArrayList();
        for (int i = 0; i < all.length; i++) {
            if(all[i]) {
                done.add(String.valueOf(i + 1));
            }
        }
        return done;
    }
    
    private String doneToString(List<String> done) {
        String output = "";
        for(String assignment : done) {
            output = output.concat(assignment + " ");
        }
        return output.trim();
    }
    
    public int numberOfDone() {
        return done().size();
    }
    
    public int hours() {
        return hours;
    }

    @Override
    public String toString() {
        return "viikko " + week + ": " + "tehtyjä tehtäviä yhteensä: " + numberOfDone() + ", aikaa kului " + hours + " tuntia, \n"
                + "tehdyt tehtävät: " + doneToString(done());
    }

}
