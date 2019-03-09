package com.example.demo;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import srini.students.GetStudentDetailsRequest;
import srini.students.GetStudentDetailsResponse;

public class Client extends WebServiceGatewaySupport {
   public GetStudentDetailsResponse getCountryDetails(int id){
      String uri = "http://localhost:8080/ws/students.wsdl/";
      GetStudentDetailsRequest request = new GetStudentDetailsRequest();
      request.setId(id);

      GetStudentDetailsResponse response =(GetStudentDetailsResponse) getWebServiceTemplate()
         .marshalSendAndReceive(uri, request);
      return response;
   }
}
