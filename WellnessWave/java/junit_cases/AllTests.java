package junit_cases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	DashboardServletTest.class,
    DatabaseConnectionTest.class,
    InsertWellnessDataServletTest.class,
    LoginServletTest.class,
    RegisterServletTest.class,
    UserRepositoryTest.class,
    UserServiceImplTest.class,
    UserServiceTest.class,
    UserTest.class,
    WebConfigTest.class,
    WellnessDataTest.class})
public class AllTests {
	
}
