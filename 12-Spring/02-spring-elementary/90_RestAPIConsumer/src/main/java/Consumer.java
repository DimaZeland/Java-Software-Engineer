import org.springframework.http.HttpEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class Consumer {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

//        String urlForGet = "https://reqres.in/api/users/2";
//        String responseFromGet = restTemplate.getForObject(urlForGet, String.class);
//
//        System.out.println(responseFromGet);

        Map<String, String> jsonToSend = new HashMap<>();
        jsonToSend.put("name", "Test name");
        jsonToSend.put("job", "Test job");

        HttpEntity<Map<String, String>> request = new HttpEntity<>(jsonToSend);

        String urlForPost = "https://reqres.in/api/users/";
        String responseFromPost = restTemplate.postForObject(urlForPost, request, String.class);

        System.out.println(responseFromPost);
    }
}
