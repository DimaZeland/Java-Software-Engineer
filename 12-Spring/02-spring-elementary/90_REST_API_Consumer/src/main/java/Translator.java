import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.server.reactive.HttpHandler;
import org.springframework.web.client.RestTemplate;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {
    // Yandex API Translator: https://cloud.yandex.ru/docs/translate/quickstart

    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Введите предложение на русском языке:");
        Scanner scanner = new Scanner(System.in);
        String sentenceToTranslate = scanner.nextLine();

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://translate.api.cloud.yandex.net/translate/v2/translate";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", "Bearer " + "tokenHash"); // replace tokenHash with a valid one

        Map<String, String> jSonData = new HashMap<>();
        jSonData.put("folderId", "b1ge46fc2qis4qcejuen");
        jSonData.put("targetLanguageCode", "en");
        jSonData.put("texts", "[" + sentenceToTranslate + "]");

        HttpEntity<Map<String, String>> request = new HttpEntity<>(jSonData, headers);

        String response = restTemplate.postForObject(url, request, String.class);
        System.out.println(response);

//         Парсим полученный JSON с помощью Jackson
        ObjectMapper mapper = new ObjectMapper();
        JsonNode obj = mapper.readTree(response);
        System.out.println("Перевод: " + obj.get("translations").get(0).get("text"));

        // Парсим полученный JSON в объект Java
        YandexResponse yandexResponse = restTemplate.postForObject(url, request, YandexResponse.class);
        System.out.println("Перевод: " + yandexResponse.getTranslations().get(0).getText());
    }
}
