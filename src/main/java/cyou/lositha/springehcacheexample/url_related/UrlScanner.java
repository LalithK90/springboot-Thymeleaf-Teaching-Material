package cyou.lositha.springehcacheexample.url_related;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UrlScanner {

    public List<String> getAllUrls() {
        System.out.println("came here");
        List<String> allUrls = new ArrayList<>();

        // Scan all classes annotated with @Controller
        String basePackage = "cyou.lositha.springehcacheexample"; // Change this to your base package
        List<Class<?>> controllerClasses = ClassScanner.scanForControllers(basePackage);
        System.out.println("controller class size " + controllerClasses.size());
        for (Class<?> controllerClass : controllerClasses) {
            // Scan all methods in the controller class annotated with @GetMapping
            List<String> urls = MethodScanner.scanForGetMappingUrls(controllerClass);
            allUrls.addAll(urls);
        }
        allUrls.forEach(System.out::println);

        return allUrls;
    }
}
