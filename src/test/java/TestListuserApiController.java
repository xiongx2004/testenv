import com.fasterxml.jackson.databind.ObjectMapper;
import com.mockrunner.mock.web.MockHttpServletRequest;
import io.swagger.api.ListuserApiController;
import io.swagger.model.Userinfo;
import org.springframework.http.ResponseEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListuserApiController {

    @Test
    public void TestlistuserGet(){

        ObjectMapper om = new ObjectMapper();
        MockHttpServletRequest msr = new MockHttpServletRequest();
        msr.setHeader("Accept", "application/json");
        msr.setMethod("GET");
        msr.setContentType("application/json");
        ListuserApiController lac = new ListuserApiController(om, msr);

        Assert.assertNotEquals(lac, null);
        ResponseEntity<Userinfo> re = lac.listuserGet();
        Assert.assertNotEquals(re, null);
        Userinfo ui = re.getBody();
        Assert.assertNotEquals(ui, null);
        Assert.assertEquals((int)ui.getAge(),123);
    }
}
