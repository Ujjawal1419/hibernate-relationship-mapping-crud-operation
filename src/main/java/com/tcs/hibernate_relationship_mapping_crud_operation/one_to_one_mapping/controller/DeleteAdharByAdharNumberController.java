package com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.controller;

import com.tcs.hibernate_relationship_mapping_crud_operation.one_to_one_mapping.dao.PersonAdharDao;

public class DeleteAdharByAdharNumberController {
      public void main(String[] args) {
    	  boolean b=new PersonAdharDao().deleteAdharByAdharNumber(845576896588l);
    	  
    	  String msg = b?"deleted":"Something went wrong check your code";
    	  
    	  System.out.println(msg);
      }
}
