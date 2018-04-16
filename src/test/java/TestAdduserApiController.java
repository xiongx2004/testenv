import com.fasterxml.jackson.databind.ObjectMapper;
import com.mockrunner.mock.web.MockHttpServletRequest;
import io.swagger.api.AdduserApiController;
import io.swagger.model.Adduserinfo;
import io.swagger.model.ModelDefault;
import io.swagger.model.Userinfo;
import org.springframework.http.ResponseEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAdduserApiController {

    @Test
    public void TestadduserGet(){

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
        System.out.println("this test is ok!");
    }

}
