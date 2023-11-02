package RecordWatcher;

import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class RecordWatcher {
    @Rule
    public TestWatcher testWatcher = new TestWatcher() {
        @Override
        protected void succeeded(Description description) {
            System.out.println(description.getMethodName() + ": Pass");
        }

        @Override
        protected void failed(Throwable e, Description description) {
            System.out.println(description.getMethodName() + ": Fail");
        }

        @Override
        protected void finished(Description description) {
            System.out.println(description.getMethodName() + ": Finished");
        }
    };
}
