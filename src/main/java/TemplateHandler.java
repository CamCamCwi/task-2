import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TemplateHandler {
    public static void handle(String jsonFilePath, String templatePath, String newTemplateName) throws IOException {
        //1.Initialize the Velocity Engine
        VelocityEngine engine = new VelocityEngine();
        engine.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        engine.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        engine.init();

        //2. Retrieving data
        JsonHandler.loadJsonDataToObject(jsonFilePath);



        //3.Initialize Velocity Context
        VelocityContext context = new VelocityContext();
        context.put("jsonData",JsonData.getInstance());
        context.put("stars",loadRatingStars());


        //4. Retrieve specific route template
        Template template = engine.getTemplate(templatePath);


        //5.Get the resulting template
        try {
            String path = "src/main/resources/outputs/" + newTemplateName + ".html";
            FileWriter fileWriter = new FileWriter(new File(path));
            template.merge(context, fileWriter);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) { e.printStackTrace(); }
    }

    private static Map<String, String> loadRatingStars(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1.0","https://cdn.tripadvisor.com/img2/email/rex/ratingstar1.0.png");
        map.put("1.5","https://cdn.tripadvisor.com/img2/email/rex/ratingstar1.5.png");
        map.put("2.0","https://cdn.tripadvisor.com/img2/email/rex/ratingstar2.0.png");
        map.put("2.5","https://cdn.tripadvisor.com/img2/email/rex/ratingstar2.5.png");
        map.put("3.0","https://cdn.tripadvisor.com/img2/email/rex/ratingstar3.0.png");
        map.put("3.5","https://cdn.tripadvisor.com/img2/email/rex/ratingstar3.5.png");
        map.put("4.0","https://cdn.tripadvisor.com/img2/email/rex/ratingstar4.0.png");
        map.put("4.5","https://cdn.tripadvisor.com/img2/email/rex/ratingstar4.5.png");
        map.put("5.0","https://cdn.tripadvisor.com/img2/email/rex/ratingstar5.0.png");

        return map;
    }
}
