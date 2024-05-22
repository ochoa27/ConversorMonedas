import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class FindMoney {
    Money findMoney( Cliente cliente) {
        String direccion = "https://v6.exchangerate-api.com/v6/ad250ee125bff193e350fac1/latest/" +cliente.getMoneyTipe() ;
        HttpResponse<String> response;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json=response.body();
            System.out.println(json);

        } catch (IOException | InterruptedException  e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(),Money.class);
    }


}
