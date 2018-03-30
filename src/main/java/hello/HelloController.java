package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/**/{[path:[^\\.]*}")
    public String index() {
    return "<!DOCTYPE html> <html> <head> <style> div { border: 1px solid gray; padding: 8px; } h1 { text-align: center; text-transform: uppercase; color: #4CAF50; } p { text-indent: 50px; text-align: justify; letter-spacing: 3px; } a { text-decoration: none; color: #008CBA; } </style> </head> <body> <div> <h1><a target=_blank href=https://confluence.rakuten-it.com/confluence/display/ESDSP/ZED+Platform>ZxD Platform!</a></h1> <p>ZED Platform is a standard platform for running services based on Container and Kubernetes with standard Monitoring, Logging, Alerting and full CI/CD pipeline automation. The goal is to have a single and simple stack that everyone in Rakuten understands and can run their systems on. </div> </body> </html>";
    }

}
