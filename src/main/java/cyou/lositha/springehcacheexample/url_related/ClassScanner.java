package cyou.lositha.springehcacheexample.url_related;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

public class ClassScanner {

    public static List<Class<?>> scanForControllers(String basePackage) {
        List<Class<?>> controllerClasses = new ArrayList<>();

        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
        TypeFilter controllerFilter = new AnnotationTypeFilter(Controller.class);
        TypeFilter restControllerFilter = new AnnotationTypeFilter(RestController.class);

        // Set up filters for @Controller and @RestController
        scanner.addIncludeFilter(controllerFilter);
        scanner.addIncludeFilter(restControllerFilter);

        // Perform scanning
        try {
            Set<BeanDefinition> metadataReaders = scanner.findCandidateComponents(basePackage);

            for (BeanDefinition metadataReader : metadataReaders) {
                String className = ((MetadataReader) metadataReader).getClassMetadata().getClassName();
                Class<?> clazz = Class.forName(className);
                controllerClasses.add(clazz);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // Handle the exception as needed
        }

        return controllerClasses;
    }
}
