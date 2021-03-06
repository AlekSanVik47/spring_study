package config;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import realizationBeanFactory.Oracle;

public class XmlConfigWithBeanFactory {
    public static void main(String... args) {
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(new ClassPathResource("xml-bean-factory-config.xml"));
        Oracle oracle = ( Oracle ) factory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
    }
}
