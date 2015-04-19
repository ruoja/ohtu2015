package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.impl.client.HttpClients;

public class Main {

    public static void main(String[] args) throws IOException {
        String studentNr = "014008742";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats-2015.herokuapp.com/students/"+studentNr+"/submissions";

        HttpClient client = HttpClients.createDefault();
        HttpGet method = new HttpGet(url);
        HttpResponse response = client.execute(method);

        HttpEntity entity =  response.getEntity();

        String bodyText = IOUtils.toString(entity.getContent());

        //System.out.println("json-muotoinen data:");
        //System.out.println( bodyText );

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        System.out.println("opiskelijanumero: " + studentNr + "\n");
        int countAssignments = 0;
        int countHours = 0;
        for (Submission submission : subs) {
            System.out.println(submission);
            countAssignments = countAssignments + submission.numberOfDone();
            countHours = countHours + submission.hours();
        }
        
        System.out.println("\nyhteensä: " + countAssignments + " tehtävää " + countHours + " tuntia");

    }
}