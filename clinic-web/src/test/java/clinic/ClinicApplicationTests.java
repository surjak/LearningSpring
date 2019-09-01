package clinic;


import com.application.clinic.ClinicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ClinicApplication.class)
public class ClinicApplicationTests {

    @Test
    public void contextLoads() {
    }

}
