//package com.jfs.realtime;
//
//import org.opensaml.core.xml.XMLObject;
//import org.opensaml.core.xml.io.Unmarshaller;
//import org.opensaml.core.xml.io.UnmarshallerFactory;
//import org.opensaml.saml2.core.Response;
//import org.opensaml.xml.io.Marshaller;
//import org.opensaml.xml.io.MarshallerFactory;
//import org.opensaml.xml.io.MarshallingException;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import java.io.ByteArrayInputStream;
//import java.nio.charset.StandardCharsets;
//
//public class SAMLResponseProcessor {
//
//    public CustomBean processSAMLResponse(String samlResponseString) {
//        try {
//            // Parse SAML response
//            byte[] responseBytes = samlResponseString.getBytes(StandardCharsets.UTF_8);
//            ByteArrayInputStream is = new ByteArrayInputStream(responseBytes);
//            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
//            documentBuilderFactory.setNamespaceAware(true);
//            DocumentBuilder docBuilder = documentBuilderFactory.newDocumentBuilder();
//            Document document = docBuilder.parse(is);
//            Element element = document.getDocumentElement();
//
//            // Unmarshal SAML response
//            UnmarshallerFactory unmarshallerFactory = org.opensaml.xml.Configuration.getUnmarshallerFactory();
//            Unmarshaller unmarshaller = unmarshallerFactory.getUnmarshaller(element);
//            Response samlResponse = (Response) unmarshaller.unmarshall(element);
//
//            // Extract attributes from SAML response
//            String nameID = samlResponse.getAssertions().get(0).getSubject().getNameID().getValue();
//            // Extract other attributes as needed...
//
//            // Create and populate custom bean
//            CustomBean customBean = new CustomBean();
//            customBean.setNameID(nameID);
//            // Set other properties of custom bean as needed...
//
//            return customBean;
//        } catch (Exception e) {
//            e.printStackTrace();
//            // Handle exception
//            return null;
//        }
//    }
//
//    public static void main(String[] args) {
//        String samlResponseString = ""; // Your SAML response string here
//        SAMLResponseProcessor processor = new SAMLResponseProcessor();
//        CustomBean customBean = processor.processSAMLResponse(samlResponseString);
//        // Use customBean as needed...
//    }
//}

//Thread