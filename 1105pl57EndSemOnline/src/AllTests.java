import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ PersonTest.class, ProjectTEst.class, ScrumBoardTest.class,
		TeamTest.class })
public class AllTests {

}
