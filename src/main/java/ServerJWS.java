import jakarta.xml.ws.Endpoint;
import org.sid.BanqueService;

public class ServerJWS {

    public static void main(String[] args) {

        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("Web service déployé sur https://0.0.0.0:9191/");
    }
}
