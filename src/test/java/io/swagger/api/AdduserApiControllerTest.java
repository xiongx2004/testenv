package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mockrunner.mock.web.MockHttpServletRequest;
import io.swagger.api.AdduserApiController;
import io.swagger.model.Adduserinfo;
import io.swagger.model.ModelDefault;
import io.swagger.model.Userinfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.http.ResponseEntity;

/** 
* AdduserApiController Tester. 
* 
* @author <Authors name> 
* @since <pre></pre> 
* @version 1.0 
*/ 
public class AdduserApiControllerTest { 

@Before
public void before() throws Exception {

} 

@After
public void after() throws Exception {

} 

/** 
* 
* Method: adduserGet(@ApiParam(value = "" ,required=true, defaultValue="") @RequestHeader(value="Authorization", required=true) String authorization, @ApiParam(value = "" ,required=true )  @Valid @RequestBody Adduserinfo _default) 
* 
*/ 
@Test
public void testAdduserGet() throws Exception { 
//TODO: Test goes here...
    ObjectMapper om = new ObjectMapper();

    MockHttpServletRequest hr = new MockHttpServletRequest();
    hr.setContentType("application/json");
    hr.setMethod("GET");
    hr.setHeader("Accept", "application/json");

    AdduserApiController aac = new AdduserApiController(om, hr);

    Assert.assertNotEquals(aac, null);
    Adduserinfo aui = new Adduserinfo();
    aui.setId("dkflsd");
    Userinfo ui = new Userinfo();
    ui.setSex(false);
    ui.setName("kkkk");
    ui.setAge(12312);
    aui.setUser(ui);
    ResponseEntity<ModelDefault> rmd = aac.adduserGet("hahahah", aui);
    Assert.assertNotEquals(rmd, null);
    Assert.assertEquals(rmd.getBody().getName(), "kkkk");
    System.out.println("this test is ok------!");
} 


} 
